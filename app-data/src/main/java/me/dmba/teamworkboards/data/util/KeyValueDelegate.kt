package me.dmba.teamworkboards.data.util

import me.dmba.teamworkboards.data.keyvalue.KeyValue
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * Created by dmba on 7/16/18.
 */
internal class KeyValueDelegate constructor(

    private val keyValue: KeyValue,

    private val key: String

) : ReadWriteProperty<Any, String> {

    override fun getValue(thisRef: Any, property: KProperty<*>) = keyValue.getString(key)

    override fun setValue(thisRef: Any, property: KProperty<*>, value: String) = keyValue.put(key, value)

}
