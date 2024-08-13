class agetest {
    //static int age = 20;
    //variable declared outside the main codeblock will be considered supreme for the whole codeblock
    //if we assign no value to int variable, then by default it is assigned 0
    public static void main(String[] args) {
        int age = 20;
        //if a variable is declared outside this codeblock and assigned value in this codeblock, it will take that value
        //or int age;
        //age = 20
        //age = 21
        //if like above updated to or reassigned the value of age then the latter will be taken into effect
        System.out.println("My age is " + age + " years.");
        System.out.println("नमस्ते");
    }
}
