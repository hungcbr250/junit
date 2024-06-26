package org.example.unittest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortName_b2 {
    public String[] sortedName(String[] nameArray) {
        nameArray = removeNullorEmpty(nameArray);
        Arrays.sort(nameArray, Comparator.comparing(SortName_b2::splitFirstName)
                .thenComparing(SortName_b2::splitLastName));
        return nameArray;
    }

    public String[] removeNullorEmpty(String[] nameArray) {
        // xóa bỏ những chuỗi null hoặc chỉ có khoảng chống
        List<Integer> listIndexRemove = new ArrayList<>();
        for (int i = 0; i < nameArray.length; i++) {
            if (nameArray[i] == null || nameArray[i].trim().isEmpty()) {
                listIndexRemove.add(i);
            }
        }
        if (!listIndexRemove.isEmpty()) {
            String[] newNameArray = new String[nameArray.length - listIndexRemove.size()];
            int index = 0;
            for (int i = 0; i < nameArray.length; i++) {
                if (!listIndexRemove.contains(i)) {
                    newNameArray[index++] = nameArray[i];
                }
            }
            return newNameArray;
        }
        return nameArray;
    }

    public static String splitFirstName(String fullName) {
        // tách chuỗi lấy tên
        String[] dataName = fullName.split("\\s+");
        return dataName[dataName.length - 1];
    }

    public static String splitLastName(String fullName) {
        // tách chuỗi lấy họ
        String[] dataName = fullName.split("\\s+");
        return dataName[0];
    }

}
