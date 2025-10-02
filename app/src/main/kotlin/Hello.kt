fun main() {
    // Paso 1
    var dirtyLevel = 20
    val waterFilter = { dirty: Int -> dirty / 2 }
    println(waterFilter(dirtyLevel))   // ⇒ 10
    // Otra forma con tipo explícito
    val waterFilterTyped: (Int) -> Int = { dirty -> dirty / 2 }
    println(waterFilterTyped(dirtyLevel))   // ⇒ 10
    // Paso 2
    fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
        return operation(dirty)
    }
    // Usando lambda
    println(updateDirty(30, waterFilter))   // ⇒ 15
    // Usando función con nombre
    fun increaseDirty(start: Int) = start + 1
    println(updateDirty(15, ::increaseDirty))   // ⇒ 16
    // Usando la sintaxis de llamada al último parámetro
    dirtyLevel = 19
    dirtyLevel = updateDirty(dirtyLevel) { dirty -> dirty + 23 }
    println(dirtyLevel)   // ⇒ 42
}
