package com.example.betterbe.workManager

/*import android.content.Context
import android.util.Log
import androidx.work.ExistingPeriodicWorkPolicy
import androidx.work.PeriodicWorkRequestBuilder
import androidx.work.WorkManager
import java.util.Calendar
import java.util.concurrent.TimeUnit


fun scheduleDailyCompletionStatusWorker(context: Context) {
    val workRequest = PeriodicWorkRequestBuilder<CreateCompletionStatusWorker>(15, TimeUnit.MINUTES)
        .setInitialDelay(calculateInitialDelay(), TimeUnit.MINUTES)
        .build()


    WorkManager.getInstance(context).enqueueUniquePeriodicWork(
        "CreateCompletionStatusWorker",
        ExistingPeriodicWorkPolicy.REPLACE,
        workRequest
    )
}

fun calculateInitialDelay(): Long {
    val currentTime = Calendar.getInstance()
    val midnightTime = Calendar.getInstance().apply {
        set(Calendar.HOUR_OF_DAY, 11)
        set(Calendar.MINUTE, 5)
        set(Calendar.SECOND, 0)
        set(Calendar.MILLISECOND, 0)
        if (before(currentTime)) {
            add(Calendar.DAY_OF_MONTH, 1)
        }
    }
    return midnightTime.timeInMillis - currentTime.timeInMillis
}*/