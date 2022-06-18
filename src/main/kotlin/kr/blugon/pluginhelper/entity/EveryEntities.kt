package kr.blugon.pluginhelper.entity

import org.bukkit.Bukkit
import org.bukkit.Server
import org.bukkit.entity.Entity

object EveryEntities {
    fun Server.getEntities(): List<Entity> {
        val entity = ArrayList<Entity>()
        for (worlds in this.worlds) {
            for (en in worlds.entities) {
                entity.add(en)
            }
        }
        return entity
    }
}