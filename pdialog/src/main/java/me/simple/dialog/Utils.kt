package me.simple.dialog

internal object Utils {

    fun reflectFieldBoolean(
        clazz: Class<*>,
        name: String,
        obj: Any,
        bool: Boolean
    ) {
        try {
            val filed = clazz.getDeclaredField(name)
            filed.isAccessible = true
            filed.setBoolean(obj, bool)
        } catch (e: Throwable) {
            e.printStackTrace()
        }
    }
}