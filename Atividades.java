//1 hello world
/*
public class Atividades {
    public static void main(String[] args) {
        System.out.println("Hello world");
    }
}


//soma2

public class Atividades {
    public static void main(String[] args) {
        int n = 1;
        int num = 2;


        System.out.println(n + num);
    }


}
//3 contagem de 0 a 10
public class Atividades {


    public static void main(String[] args) {
        for(int i = 0; i<=10; i++){
            System.out.println(i);
        };

    }
}





// 7

public class Atividades {
    public static void main(String[] args) {
        String nome = "Formula";
        int n = 1;

        System.out.println(nome+n);


    }


}
// 10

public class Atividades {
    public static void main(String[] args) {
        String s = "hello";
        int i = 10;
        Boolean b =  true;
        float f = 3;

        System.out.println(s + i + b +3 );
    }

}
// 4 conversor de celsius pra farenheit
public class Atividades {

    public static void main(String[] args) {
        int celsius = 20;
        int farenheit = ((celsius / 5 * 9) + 32);
        System.out.println(farenheit);

    }

}

//5 conversor de farenheit pra celsius
public class Atividades {

    public static void main(String[] args) {
        int farenheit  = 20;
        int  celsius = ((farenheit - 32 ) * 5/9);
        System.out.println(celsius);

    }

}

//6 comparar valores pra ver se sao iguais ou do mesmo tipo

public class Atividades {
    public static void main(String[] args) {
        int n = 2;
        int n2 = 2;

        if(n == n2){
            System.out.println("numeros sao iguais");

        }else{
            System.out.println("Numeros sao diferentes");
        }
    }
}

//9Usar operadores logicos pra verificar se nomes sao do mesmo tipo
public class Atividades {
    public static void main(String[] args) {
        String nome1 = "Rian";
        String nome2 = "Rian";

        if (nome1 == nome2) {
            System.out.println("nomes sao iguais");

        } else {
            System.out.println("Nomes sao diferentes");
        }
    }
}*/

//8Criar uma classe e utilizar ela em outra

public class Atividades {
        String nome = "Mari";
        int idade = 15;



        public void Exibirinfos(){
            System.out.println(nome);
            System.out.println(idade);

        }
    public static void main(String[] args) {

        Atividades infos = new Atividades();
        infos.Exibirinfos();
    }
}



