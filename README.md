
## Preguntas de análisis

1. ¿En qué parte del ejercicio se aplica IoC y en cuál DI?

IoC: Quarkus crea los objetos. DI: VentaService recibe las calculadoras por atributo y Auditoria por constructor.

2. ¿Qué función cumplen los Qualifiers y por qué son necesarios?

Ponen nombre a cada implementación (@Named). Hacen falta porque Regular y VIP son del mismo tipo y Quarkus no sabría cuál elegir.

3. ¿Cuál es la diferencia entre @ApplicationScoped y @Dependent?

@ApplicationScoped es una sola instancia compartida por toda la app. @Dependent es una instancia propia para cada clase que la inyecta.

4. ¿Por qué las instancias @ApplicationScoped pueden reutilizarse entre varias ventas?

Porque se crean una vez y no guardan datos de cada venta. El UUID es el mismo en las cuatro ventas.

5. ¿Qué sucedería si se elimina el Qualifier de un punto de inyección de CalculadoraDescuento?

Daría error al arrancar, porque habría dos opciones y Quarkus no sabría cuál inyectar.