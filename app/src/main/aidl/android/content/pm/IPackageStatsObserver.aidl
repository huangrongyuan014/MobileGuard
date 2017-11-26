// IPackageStatsObserver.aidl
package android.content.pm;

// Declare any non-default types here with import statements
import android.content.pm. PackageStats;
oneway interface IPackageStatsObserver {
   void onGetStatsCompleted(in PackageStats pStats,boolean succeded);
}
