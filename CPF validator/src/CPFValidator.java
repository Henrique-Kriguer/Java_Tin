public class CPFValidator {


        public static void main(String[] args) {
            String cpf = "123456789"; // Example CPF without verification digits
            String fullCpf = cpf + calculateVerificationDigits(cpf);
            System.out.println("Full CPF: " + fullCpf);
        }

        public static String calculateVerificationDigits(String cpf) {
            int firstDigit = calculateDigit(cpf, 10);
            int secondDigit = calculateDigit(cpf + firstDigit, 11);
            return "" + firstDigit + secondDigit;
        }

        private static int calculateDigit(String cpf, int weight) {
            int sum = 0;
            for (int i = 0; i < cpf.length(); i++) {
                sum += Character.getNumericValue(cpf.charAt(i)) * weight--;
            }
            int remainder = sum % 11;
            return (remainder < 2) ? 0 : 11 - remainder;
        }
    

}
