# Moda Elite

Sistema de gestión de tienda para una aplicación de moda, con una interfaz web en HTML/CSS/JS y clases Java de modelo.

## Descripción del proyecto

Moda Elite es una aplicación de ejemplo que simula un panel administrativo para una tienda de moda. Incluye:

- Interfaz de usuario para el dashboard, productos, inventario, ventas y clientes.
- Login estático de administrador.
- Reloj y fecha en tiempo real en el dashboard y ventas.
- Pages y estilos responsive con un menú lateral.
- Clases Java que modelan productos e inventario.

## Estructura del proyecto

- index.html - Página principal del dashboard.
- login.html - Página de inicio de sesión.
- productos.html - Gestión y visualización de productos.
- inventario.html - Control de existencias y estado del inventario.
- ventas.html - Punto de venta y lista de ventas recientes.
- clientes.html - Página de clientes.
- styles/style.css - Estilos globales del frontend.
- scripts/script.js - Funcionalidad del reloj y comportamientos generales.
- src/Producto.java - Clase modelo para productos.
- src/Inventario.java - Clase modelo para inventario.
- bin/ - Carpeta de salida de compilación Java.

## Funcionalidades principales

- Autenticación simple con usuario admin y contraseña 1234.
- Navegación por diferentes módulos de la tienda.
- Visualización de estadísticas del dashboard.
- Interfaz de productos con botones para editar y eliminar (simulados en frontend).
- Inventario con estados de producto y búsqueda de artículos.
- Vista de ventas con productos disponibles y ejemplos de facturas.
- Reloj en tiempo real en las páginas principales.

## Documentación de las clases Java

### Producto.java

Representa un producto en la tienda con atributos y métodos de acceso.

Propiedades:

- id - Identificador numérico del producto.
- nombre - Nombre del producto.
- categoria - Categoría a la que pertenece.
- precio - Precio del producto.
- stock - Cantidad disponible en inventario.
- talla - Talla del producto.

### Inventario.java

Modela el estado del inventario para un producto específico.

Propiedades:

- producto - Nombre del producto en inventario.
- stock - Cantidad disponible.
- estado - Estado descriptivo (Disponible, Bajo, Agotado).

Métodos:

- actualizarStock(int nuevoStock) - Actualiza la cantidad de stock.

## Uso del proyecto

1. Abrir login.html en el navegador.
2. Iniciar sesión con:
   - Usuario: admin
   - Contraseña: 1234
3. Navegar entre Dashboard, Productos, Inventario, Ventas y Clientes.

## Notas técnicas

- El login está implementado en el mismo HTML (login.html) mediante JavaScript.
- El script scripts/script.js actualiza hora y fecha cada segundo.
- Las páginas del frontend contienen contenido estático y muestran cómo podría funcionar una aplicación de gestión.

## Posibles mejoras

- Conectar el frontend a un backend real para guardar productos, inventario y ventas.
- Usar almacenamiento local (localStorage) para persistir datos entre sesiones.
- Añadir validaciones de formularios y gestión completa de CRUD.
- Implementar backend Java con Producto e Inventario para lógica de negocio real.
- Migrar la aplicación a un framework moderno (React, Angular, Vue) si se desea mayor escalabilidad.