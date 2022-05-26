import javax.swing.JOptionPane;

import br.com.caelum.stella.inwords.FormatoDeInteiro;
import br.com.caelum.stella.inwords.InteiroSemFormato;
import br.com.caelum.stella.inwords.NumericToWordsConverter;
import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;

public class App {
    public static void main(String[] args)  {
        String cpf = "123.456.789-11";

        CPFValidator validator = new CPFValidator();
        try{
            validator.assertValid(cpf);
            JOptionPane.showMessageDialog(null, "CPF: " +cpf + " valido" );
        }catch(InvalidStateException e) { // exception lançada quando o documento é inválido
            System.out.println(e.getInvalidMessages());
            JOptionPane.showMessageDialog(null, "CPF invalido");
        }

        NumericToWordsConverter converter;  
        converter = new NumericToWordsConverter(new InteiroSemFormato());  
        double numero = 1025058000087.3;  
        String extenso = converter.toWords(numero);  
        System.out.println(extenso);

        
        
    }
}
