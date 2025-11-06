public class CalculateAgeInYear {
    private final int age;
    private final int currentYear;
    private final int ageYearIn;
    
    public CalculateAgeInYear(final int age, final int currentYear, final int ageYearIn){
        this.age = age;
        this.currentYear = currentYear;
        this.ageYearIn = ageYearIn;
    }

    public int CalculateAge(){
        return age + (ageYearIn - currentYear);
    }

}
