package org.lewisandclark.csd.basicfantasy;

/**
 * Created by Thorin Schmidt on 3/30/2018.
 */
class GameConstants {
    static final int[][] FIGHTER_SAVE_MATRIX = {
            {13,14,15,16,18}, //level 0
            {12,13,14,15,17},
            {11,12,14,15,16},
            {11,12,14,15,16},
            {11,11,13,14,15},
            {11,11,13,14,15}, //level 5
            {10,11,12,14,15},
            {10,11,12,14,15},
            { 9,10,12,13,14},
            { 9,10,12,13,14},
            { 9, 9,11,12,13}, //level 10
            { 9, 9,11,12,13},
            { 8, 9,10,12,13},
            { 8, 9,10,12,13},
            { 7, 8,10,11,12},
            { 7, 8,10,11,12}, //level 15
            { 7, 7, 9,10,11},
            { 7, 7, 9,10,11},
            { 6, 7, 8,10,11},
            { 6, 7, 8,10,11},
            { 5, 6, 8, 9,10}}; //level 20

    static final int[][] CLERIC_SAVE_MATRIX = {
            {12,13,15,17,16}, //level 0
            {11,12,14,16,15},
            {10,11,13,15,14},
            {10,11,13,15,14},
            { 9,10,13,15,14},
            { 9,10,13,15,14}, //level 5
            { 9,10,13,15,14},
            { 9,10,13,15,14},
            { 8, 9,12,14,13},
            { 8, 9,12,14,13},
            { 8, 9,11,13,12}, //level 10
            { 8, 9,11,13,12},
            { 7, 8,11,13,12},
            { 7, 8,11,13,12},
            { 7, 8,10,12,11},
            { 7, 8,10,12,11}, //level 15
            { 6, 7,10,12,11},
            { 6, 7,10,12,11},
            { 6, 7, 9,11,10},
            { 6, 7, 9,11,10},
            { 5, 6, 9,11,10}}; //level 20

    static final int[][] MU_SAVE_MATRIX = {
            {14,15,14,17,16}, //level 0
            {13,14,13,16,15},
            {13,14,13,15,14},
            {13,14,13,15,14},
            {12,13,12,15,13},
            {12,13,12,15,13}, //level 5
            {12,12,11,14,13},
            {12,12,11,14,13},
            {11,11,10,14,12},
            {11,11,10,14,12},
            {11,10, 9,13,11}, //level 10
            {11,10, 9,13,11},
            {10,10, 9,13,11},
            {10,10, 9,13,11},
            {10, 9, 8,12,10},
            {10, 9, 8,12,10}, //level 15
            { 9, 8, 7,12, 9},
            { 9, 8, 7,12, 9},
            { 9, 7, 6,11, 9},
            { 9, 7, 6,11, 9},
            { 8, 6, 5,11, 8}}; //level 20

    static final int[][] THIEF_SAVE_MATRIX = {
            {14,15,14,17,16}, //level 0
            {13,14,13,16,15},
            {12,14,12,15,14},
            {12,14,12,15,14},
            {11,13,12,14,13},
            {11,13,12,14,13}, //level 5
            {11,13,11,13,13},
            {11,13,11,13,13},
            {10,12,11,12,12},
            {10,12,11,12,12},
            { 9,12,10,11,11}, //level 10
            { 9,12,10,11,11},
            { 9,10,10,10,11},
            { 9,10,10,10,11},
            { 8,10, 9, 9,10},
            { 8,10, 9, 9,10}, //level 15
            { 7, 9, 9, 8, 9},
            { 7, 9, 9, 8, 9},
            { 7, 9, 8, 7, 9},
            { 7, 9, 8, 7, 9},
            { 6, 8, 8, 6, 8}}; //level 20

    static final int[][] FIGHTER_MU_SAVE_MATRIX = {
            {13,14,15,16,18}, //level 0
            {12,13,13,15,15},
            {11,12,13,15,14},
            {11,12,14,15,14},
            {11,11,12,14,13},
            {11,11,13,14,13}, //level 5
            {10,11,11,14,13},
            {10,11,11,14,13},
            { 9,10,10,13,12},
            { 9,10,10,13,12},
            { 9, 9, 9,12,11}, //level 10
            { 9, 9, 9,12,11},
            { 8, 9, 9,12,11},
            { 8, 9, 9,12,11},
            { 7, 8, 8,11,10},
            { 7, 8, 8,11,10}, //level 15
            { 7, 7, 7,10, 9},
            { 7, 7, 7,10, 9},
            { 6, 7, 6,10, 9},
            { 6, 7, 6,10, 9},
            { 5, 6, 5, 9, 8}}; //level 20

    static final int[][] MU_THIEF_SAVE_MATRIX = {
            {14,15,14,17,16}, //level 0
            {13,14,13,16,15},
            {12,14,12,15,14},
            {12,14,12,15,14},
            {11,13,12,14,13},
            {11,13,12,14,13}, //level 5
            {11,12,11,13,13},
            {11,12,11,13,13},
            {10,11,10,12,12},
            {10,11,10,12,12},
            { 9,10, 9,11,11}, //level 10
            { 9,10, 9,11,11},
            { 9,10, 9,10,11},
            { 9,10, 9,10,11},
            { 8, 9, 8, 9,10},
            { 8, 9, 8, 9,10}, //level 15
            { 7, 8, 7, 8, 9},
            { 7, 8, 7, 8, 9},
            { 7, 7, 6, 7, 9},
            { 7, 7, 6, 7, 9},
            { 6, 6, 5, 6, 8}}; //level 20

    static final int[][] ATTACK_BONUS_MATRIX ={
            //Cleric
            {0,1,1,2,2,3,3,4,4,5,5,5,6,6,6,7,7,7,8,8,8},
            //Fighter
            {0,1,2,2,3,4,4,5,6,6,6,7,7,8,8,8,9,9,10,10,10},
            //Magic User
            {0,1,1,1,2,2,3,3,3,4,4,4,4,5,5,5,6,6,6,7,7},
            //Thief
            {0,1,1,2,2,3,3,4,4,5,5,5,6,6,6,7,7,7,8,8,8},
            //Fighter/MU
            {0,1,2,2,3,4,4,5,6,6,6,7,7,8,8,8,9,9,10,10,10},
            //MU/Thief
            {0,1,1,2,2,3,3,4,4,5,5,5,6,6,6,7,7,7,8,8,8}
    };
}
