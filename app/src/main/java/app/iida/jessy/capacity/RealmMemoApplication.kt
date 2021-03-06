package app.iida.jessy.capacity

import android.app.Application
import io.realm.Realm
import io.realm.RealmConfiguration

class RealmMemoApplication<T, U> : Application(){

    override fun onCreate() {
        super.onCreate()

        Realm.init(this)
        val realmConfig = RealmConfiguration.Builder()
            .deleteRealmIfMigrationNeeded()
            .build()
        Realm.setDefaultConfiguration(realmConfig)
    }

    fun onBindViewHolder(holder: TaskAdapter.TaskViewHolder, position: Int) {}
}