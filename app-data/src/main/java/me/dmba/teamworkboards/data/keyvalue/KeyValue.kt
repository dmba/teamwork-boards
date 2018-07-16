package me.dmba.teamworkboards.data.keyvalue

import me.dmba.teamworkboards.common.utils.EMPTY

/**
 * Created by dmba on 7/16/18.
 */
interface KeyValue {

    fun put(key: String, value: Any)

    fun contains(key: String): Boolean

    fun getString(key: String, defaultValue: String = EMPTY): String

    fun getBool(key: String, defaultValue: Boolean = false): Boolean

    fun getInt(key: String, defaultValue: Int = Int.MIN_VALUE): Int

    fun getLong(key: String, defaultValue: Long = Long.MIN_VALUE): Long

    fun getFloat(key: String, defaultValue: Float = Float.MIN_VALUE): Float

}
