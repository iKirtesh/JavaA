public class ComplexNum {

    float real, imag;

    ComplexNum() {
        real = 0;
        imag = 0;
    }

    ComplexNum(float comp1, float comp2) {
        real = comp1;
        imag = comp2;
    }

    // for addition
    public void AddNumbers(ComplexNum c1, ComplexNum c2) {
        float real, imag;

        real = (c1.real + c2.real);
        imag = (c1.imag + c2.imag);

        System.out.println("Sum of complex numbers is: " + real + " + " + imag + "i");

    }

    // for subtraction
    public void SubNumbers(ComplexNum c1, ComplexNum c2) {
        float real, imag;

        real = (c1.real - c2.real);
        imag = (c1.imag - c2.imag);

        System.out.println("Difference of complex numbers is: " + real + " + " + imag + "i");

    }

    // for multiplican
    public void MulNumbers(ComplexNum c1, ComplexNum c2) {
        float real, imag;

        real = (c1.real * c2.real) - (c1.imag * c2.imag);
        imag = (c1.imag * c2.real) + (c1.real * c2.imag);

        System.out.println("Multiplication of the complex number is:" + real + " * " + imag + "i");
    }

    // for division
    public void DivNumbers(ComplexNum c1, ComplexNum c2) {
        float real, imag;
        float den;
        den = c2.real * c2.real + c2.imag * c2.imag;

        real = ((c1.real * c2.real) + (c1.imag * c2.imag)) / den;
        imag = ((c1.imag * c2.real) - (c1.real * c2.imag)) / den;

        System.out.println("Division of the complex number is:" + real + " / " + imag + "i");

    }
}