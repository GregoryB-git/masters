/*
 * Decompiled with CFR 0_124.
 */
package c5;

import c5.m;

public abstract class c
extends m {
    public static final int[][] a;

    static {
        int[] arrn = new int[]{2, 2, 2, 1, 2, 2};
        int[] arrn2 = new int[]{2, 2, 2, 2, 2, 1};
        int[] arrn3 = new int[]{1, 2, 1, 2, 2, 3};
        int[] arrn4 = new int[]{1, 2, 1, 3, 2, 2};
        int[] arrn5 = new int[]{1, 3, 1, 2, 2, 2};
        int[] arrn6 = new int[]{1, 2, 2, 2, 1, 3};
        int[] arrn7 = new int[]{2, 2, 1, 2, 1, 3};
        int[] arrn8 = new int[]{2, 2, 1, 3, 1, 2};
        int[] arrn9 = new int[]{1, 1, 2, 2, 3, 2};
        int[] arrn10 = new int[]{1, 2, 2, 2, 3, 1};
        int[] arrn11 = new int[]{1, 1, 3, 2, 2, 2};
        int[] arrn12 = new int[]{1, 2, 3, 1, 2, 2};
        int[] arrn13 = new int[]{2, 2, 3, 2, 1, 1};
        int[] arrn14 = new int[]{2, 2, 1, 1, 3, 2};
        int[] arrn15 = new int[]{2, 2, 1, 2, 3, 1};
        int[] arrn16 = new int[]{2, 1, 3, 2, 1, 2};
        int[] arrn17 = new int[]{2, 2, 3, 1, 1, 2};
        int[] arrn18 = new int[]{3, 1, 2, 1, 3, 1};
        int[] arrn19 = new int[]{3, 1, 1, 2, 2, 2};
        int[] arrn20 = new int[]{3, 2, 1, 1, 2, 2};
        int[] arrn21 = new int[]{3, 2, 1, 2, 2, 1};
        int[] arrn22 = new int[]{3, 1, 2, 2, 1, 2};
        int[] arrn23 = new int[]{3, 2, 2, 2, 1, 1};
        int[] arrn24 = new int[]{2, 1, 2, 1, 2, 3};
        int[] arrn25 = new int[]{2, 1, 2, 3, 2, 1};
        int[] arrn26 = new int[]{1, 1, 1, 3, 2, 3};
        int[] arrn27 = new int[]{1, 3, 1, 1, 2, 3};
        int[] arrn28 = new int[]{1, 3, 1, 3, 2, 1};
        int[] arrn29 = new int[]{1, 3, 2, 1, 1, 3};
        int[] arrn30 = new int[]{1, 3, 2, 3, 1, 1};
        int[] arrn31 = new int[]{2, 1, 1, 3, 1, 3};
        int[] arrn32 = new int[]{2, 3, 1, 1, 1, 3};
        int[] arrn33 = new int[]{2, 3, 1, 3, 1, 1};
        int[] arrn34 = new int[]{1, 1, 2, 1, 3, 3};
        int[] arrn35 = new int[]{1, 1, 2, 3, 3, 1};
        int[] arrn36 = new int[]{1, 3, 2, 1, 3, 1};
        int[] arrn37 = new int[]{1, 1, 3, 1, 2, 3};
        int[] arrn38 = new int[]{1, 1, 3, 3, 2, 1};
        int[] arrn39 = new int[]{1, 3, 3, 1, 2, 1};
        int[] arrn40 = new int[]{3, 1, 3, 1, 2, 1};
        int[] arrn41 = new int[]{2, 1, 1, 3, 3, 1};
        int[] arrn42 = new int[]{2, 1, 3, 1, 1, 3};
        int[] arrn43 = new int[]{2, 1, 3, 1, 3, 1};
        int[] arrn44 = new int[]{3, 1, 1, 1, 2, 3};
        int[] arrn45 = new int[]{3, 1, 1, 3, 2, 1};
        int[] arrn46 = new int[]{3, 3, 1, 1, 2, 1};
        int[] arrn47 = new int[]{3, 1, 2, 3, 1, 1};
        int[] arrn48 = new int[]{3, 1, 4, 1, 1, 1};
        int[] arrn49 = new int[]{2, 2, 1, 4, 1, 1};
        int[] arrn50 = new int[]{4, 3, 1, 1, 1, 1};
        int[] arrn51 = new int[]{1, 1, 1, 2, 2, 4};
        int[] arrn52 = new int[]{1, 1, 1, 4, 2, 2};
        int[] arrn53 = new int[]{1, 2, 1, 1, 2, 4};
        int[] arrn54 = new int[]{1, 2, 1, 4, 2, 1};
        int[] arrn55 = new int[]{1, 4, 1, 1, 2, 2};
        int[] arrn56 = new int[]{1, 4, 1, 2, 2, 1};
        int[] arrn57 = new int[]{1, 1, 2, 4, 1, 2};
        int[] arrn58 = new int[]{1, 2, 2, 4, 1, 1};
        int[] arrn59 = new int[]{1, 4, 2, 1, 1, 2};
        int[] arrn60 = new int[]{2, 4, 1, 2, 1, 1};
        int[] arrn61 = new int[]{2, 2, 1, 1, 1, 4};
        int[] arrn62 = new int[]{4, 1, 3, 1, 1, 1};
        int[] arrn63 = new int[]{1, 3, 4, 1, 1, 1};
        int[] arrn64 = new int[]{1, 1, 1, 2, 4, 2};
        int[] arrn65 = new int[]{1, 2, 1, 1, 4, 2};
        int[] arrn66 = new int[]{1, 2, 1, 2, 4, 1};
        int[] arrn67 = new int[]{1, 1, 4, 2, 1, 2};
        int[] arrn68 = new int[]{1, 2, 4, 1, 1, 2};
        int[] arrn69 = new int[]{4, 1, 1, 2, 1, 2};
        int[] arrn70 = new int[]{4, 2, 1, 2, 1, 1};
        int[] arrn71 = new int[]{2, 1, 2, 1, 4, 1};
        int[] arrn72 = new int[]{2, 1, 4, 1, 2, 1};
        int[] arrn73 = new int[]{4, 1, 2, 1, 2, 1};
        int[] arrn74 = new int[]{1, 1, 1, 1, 4, 3};
        int[] arrn75 = new int[]{1, 1, 1, 3, 4, 1};
        int[] arrn76 = new int[]{1, 3, 1, 1, 4, 1};
        int[] arrn77 = new int[]{1, 1, 4, 1, 1, 3};
        int[] arrn78 = new int[]{1, 1, 4, 3, 1, 1};
        int[] arrn79 = new int[]{4, 1, 1, 1, 1, 3};
        int[] arrn80 = new int[]{4, 1, 1, 3, 1, 1};
        int[] arrn81 = new int[]{1, 1, 3, 1, 4, 1};
        int[] arrn82 = new int[]{1, 1, 4, 1, 3, 1};
        int[] arrn83 = new int[]{3, 1, 1, 1, 4, 1};
        int[] arrn84 = new int[]{4, 1, 1, 1, 3, 1};
        int[] arrn85 = new int[]{2, 1, 1, 4, 1, 2};
        a = new int[][]{{2, 1, 2, 2, 2, 2}, arrn, arrn2, arrn3, arrn4, arrn5, arrn6, {1, 2, 2, 3, 1, 2}, {1, 3, 2, 2, 1, 2}, arrn7, arrn8, {2, 3, 1, 2, 1, 2}, arrn9, {1, 2, 2, 1, 3, 2}, arrn10, arrn11, arrn12, {1, 2, 3, 2, 2, 1}, arrn13, arrn14, arrn15, arrn16, arrn17, arrn18, arrn19, arrn20, arrn21, arrn22, {3, 2, 2, 1, 1, 2}, arrn23, arrn24, arrn25, {2, 3, 2, 1, 2, 1}, arrn26, arrn27, arrn28, {1, 1, 2, 3, 1, 3}, arrn29, arrn30, arrn31, arrn32, arrn33, arrn34, arrn35, arrn36, arrn37, arrn38, arrn39, arrn40, arrn41, {2, 3, 1, 1, 3, 1}, arrn42, {2, 1, 3, 3, 1, 1}, arrn43, arrn44, arrn45, arrn46, {3, 1, 2, 1, 1, 3}, arrn47, {3, 3, 2, 1, 1, 1}, arrn48, arrn49, arrn50, arrn51, arrn52, arrn53, arrn54, arrn55, arrn56, {1, 1, 2, 2, 1, 4}, arrn57, {1, 2, 2, 1, 1, 4}, arrn58, arrn59, {1, 4, 2, 2, 1, 1}, arrn60, arrn61, arrn62, {2, 4, 1, 1, 1, 2}, arrn63, arrn64, arrn65, arrn66, arrn67, arrn68, {1, 2, 4, 2, 1, 1}, arrn69, {4, 2, 1, 1, 1, 2}, arrn70, arrn71, arrn72, arrn73, arrn74, arrn75, arrn76, arrn77, arrn78, arrn79, arrn80, arrn81, arrn82, arrn83, arrn84, arrn85, {2, 1, 1, 2, 1, 4}, {2, 1, 1, 2, 3, 2}, {2, 3, 3, 1, 1, 1, 2}};
    }
}

