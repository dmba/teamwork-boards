package me.dmba.teamworkboards.data.keyvalue

import android.content.SharedPreferences
import javax.inject.Inject

/**
 * Created by dmba on 7/16/18.
 */
internal class SharedPrefsKeyValue @Inject constructor(

    private val prefs: SharedPreferences

) : KeyValue {

    override fun put(key: String, value: Any) {
        prefs.edit().apply {
            when (value) {
                is Boolean -> putBoolean(key, value)
                is String -> putString(key, value)
                is Float -> putFloat(key, value)
                is Long -> putLong(key, value)
                is Int -> putInt(key, value)
            }
        }.apply()
    }

    override fun contains(key: String): Boolean {
        return prefs.contains(key)
    }

    override fun getString(key: String, defaultValue: String): String {
        return prefs.getString(key, defaultValue)
    }

    override fun getBool(key: String, defaultValue: Boolean): Boolean {
        return prefs.getBoolean(key, defaultValue)
    }

    override fun getFloat(key: String, defaultValue: Float): Float {
        return prefs.getFloat(key, defaultValue)
    }

    override fun getLong(key: String, defaultValue: Long): Long {
        return prefs.getLong(key, defaultValue)
    }

    override fun getInt(key: String, defaultValue: Int): Int {
        return prefs.getInt(key, defaultValue)
    }

}
