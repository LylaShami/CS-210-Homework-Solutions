public class PrintHangMan {
    public static String getPrintSmiley(){
       return printSmiley();
    }

    private static String printSmiley() {
        return "  //||||||||         \n" + "//        |\n" + "||      * * *\n" + "||     * - - *\n" + "||     *  ^  *\n" + "||      * * * \n" + "||                 \n" + "||               \n" + "||\n" + "||\n" + "||\n" + "||\n" + "||\n" + "||\n" + "||||||";
    }

    public static String getPrintSmileyTorso() {
        return " //||||||||         \n" + "//        |\n" + "||      * * *\n" + "||     * - - *\n" + "||     *  ^  *\n" + "||      * * * \n" + "||        *                \n" + "||        *              \n" + "||        *\n" + "||        *\n" + "||\n" + "||\n" + "||\n" + "||\n" + "||||||";
    }

    public static String printSmileyTorsoRightArm() {
        return " //||||||||         \n" + "//        |\n" + "||      * * *\n" + "||     * - - *\n" + "||     *  ^  *\n" + "||      * * * \n" + "||        *                \n" + "||        * *              \n" + "||        *  *    \n" + "||        *\n" + "||\n" + "||\n" + "||\n" + "||\n" + "||||||";
    }

    public static String printSmileyTorsoRightArmLeftArm() {
        return " //||||||||         \n" + "//        |\n" + "||      * * *\n" + "||     * - - *\n" + "||     *  ^  *\n" + "||      * * * \n" + "||        *                \n" + "||      * * *              \n" + "||     *  *  *    \n" + "||        *\n" + "||\n" + "||\n" + "||\n" + "||\n" + "|||||| ";
    }

    public static String printSmileyTorsoRightArmLeftArmRightLeg() {
        return " //||||||||         \n" + "//        |\n" + "||      * * *\n" + "||     * - - *\n" + "||     *  ^  *\n" + "||      * * * \n" + "||        *                \n" + "||      * * *              \n" + "||     *  *  *    \n" + "||        *\n" + "||         *          \n" + "||          *\n" + "||\n" + "||\n" + "|||||| ";
    }

    public static String printSmileyTorsoRightArmLeftArmRightLegLeftLeg() {
        return "  //||||||||         \n" + "//        |\n" + "||      * * *\n" + "||     * - - *\n" + "||     *  ^  *\n" + "||      * * * \n" + "||        *                \n" + "||      * * *              \n" + "||     *  *  *    \n" + "||        *\n" + "||       * *          \n" + "||      *   *\n" + "||\n" + "||\n" + "||||||";

    }

}
