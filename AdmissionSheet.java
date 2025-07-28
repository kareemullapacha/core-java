public class AdmissionSheet {
    public static void main(String[] args) {
        // Admission sheet details
        int gradeLevel = 10;
        double baseTuitionFee = 2000;

        double discountPercentage = 0.0;

        // Student status
        boolean academicTopperStatus = true;

        // Discount calculation
        if (gradeLevel >= 9 && gradeLevel <= 12) {
            if (academicTopperStatus) {
                discountPercentage = 20.0; // Discount for topper students
            } else {
                discountPercentage = 30.0; // Discount for base students
            }
        } else if (gradeLevel >= 6 && gradeLevel <= 8) {
            discountPercentage = 5.0; // Discount for grades 6–8
        } else {
            discountPercentage = 0.0; // No discount for lower grades
        }

        // Additional grade-specific discounts
        if (gradeLevel == 10) {
            discountPercentage += 3.0;
        } else if (gradeLevel == 12) {
            discountPercentage += 5.0;
        }

        // Final fee calculation
        double discountAmount = (discountPercentage / 100) * baseTuitionFee;
        double finalTuitionFee = baseTuitionFee - discountAmount;

        // Display the result
        System.out.println("Grade Level: " + gradeLevel);
        System.out.println("Academic Topper: " + academicTopperStatus);
        System.out.println("Base Tuition Fee: " + baseTuitionFee);
        System.out.println("Total Discount Percentage: " + discountPercentage + "%");
        System.out.println("Discount Amount: " + discountAmount);
        System.out.println("Final Tuition Fee: " + finalTuitionFee);
    }
}
