# Guía 1 – De lo lineal a lo jerárquico

**Asignatura:** Estructura de Datos II – Ingeniería de Software, IV semestre
**Autor:** Miguel Angel Meneses Arevalo

## Contenido del repositorio

- `Actividad1.java`: clase principal que construye el árbol y lo imprime.
- `NodoGeneral.java`: clase genérica con un dato y una lista de hijos.
- `diagrama.drawio` / `diagrama.pdf`: árbol del organigrama modelado en Draw.io.

## Clasificación de los cuatro escenarios

| Escenario | Clasificación | Justificación |
|---|---|---|
| Sistema de archivos | Jerárquico | Una carpeta contiene archivos y otras carpetas; hay una raíz y cada elemento tiene un solo padre. |
| Organigrama empresarial | Jerárquico | Un cargo tiene varios subordinados, que a su vez tienen otros; existe una raíz (gerencia general). |
| Menú de una aplicación | Jerárquico | El menú principal tiene submenús y estos tienen opciones; cada opción depende de un solo menú. |
| Árbol genealógico | Jerárquico (mixto si se incluyen parejas) | Un padre puede tener varios hijos. Si se agregan ambos padres de cada persona, deja de ser un árbol estricto. |

Una estructura lineal solo sirve para recorrer elementos uno tras otro (por ejemplo, los archivos de una sola carpeta).

## Jerarquía implementada (organigrama)

```
- Empresa
   - Tecnologia
      - Desarrollo
      - Soporte
   - Finanzas
      - Contabilidad
      - Tesoreria
   - Talento Humano
      - Seleccion
```

9 nodos distribuidos en 3 niveles.

## Ejercicios

**Dos ventajas de usar un árbol en vez de una lista**

1. Representa de forma natural que un elemento tiene varios descendientes; en una lista cada elemento solo tiene un siguiente.
2. Permite recorrer o buscar por ramas y se ve claramente el nivel de cada nodo.

**¿Qué pasaría si un nodo tuviera más de un padre?**
Dejaría de ser un árbol y pasaría a ser un grafo. Ya no habría un único camino desde la raíz hasta cada nodo, podrían aparecer ciclos y los recorridos recursivos tendrían que controlar los nodos ya visitados.

## Cómo ejecutar

```
javac NodoGeneral.java Actividad1.java
java Actividad1
```

(En NetBeans: clic derecho sobre `Actividad1.java` → Run File, o Shift + F6.)

## Reflexión

Los árboles resultan más naturales que las listas cuando un elemento se relaciona con varios descendientes. En una lista cada elemento solo tiene un siguiente, por lo que representar un organigrama, un sistema de archivos o un menú obligaría a aplanar la información y perder quién depende de quién. En un árbol, en cambio, la relación padre-hijo queda explícita: hay una raíz, niveles y ramas que se pueden recorrer de forma recursiva, como hace el método imprimir de mi clase NodoGeneral.

Al modelar el organigrama de la empresa en Java vi que bastaba con que cada nodo guardara su dato y una lista de hijos para construir cualquier jerarquía, y que el uso de genéricos permite reutilizar la misma clase con otros tipos de datos. También entendí que la restricción de un solo padre es lo que mantiene la estructura como árbol: si un nodo pudiera tener varios padres, el modelo pasaría a ser un grafo, aparecerían caminos múltiples y habría que controlar los nodos visitados. Por eso elegir la estructura correcta depende de cómo se relacionan los datos del problema.
