package com.example.loading.task7;

public class GetLatestVersion {

    public static void main(String[] args) {
        String version1 = "8.1.4.2";
        String version2 = "8.2.3.1";

        String latestVersion = getLatestVersion(version1, version2);
        System.out.println("Более свежая версия: " + latestVersion);
    }

    public static String getLatestVersion(String version1, String version2) {
        String[] parts1 = version1.split("\\.");
        String[] parts2 = version2.split("\\.");

        for (int i = 0; i < Math.min(parts1.length, parts2.length); i++) {
            if (Integer.parseInt(parts1[i]) > Integer.parseInt(parts2[i])) {
                return version1;
            } else if (Integer.parseInt(parts1[i]) < Integer.parseInt(parts2[i])) {
                return version2;
            }
        }

        // Если же все части версий совпали, функция вернет версию с большим количеством частей, так как эта версия
        // является более длинной, потенциально более "новой".
        if (parts1.length > parts2.length) {
            return version1;
        } else {
            return version2;
        }
    }
}
