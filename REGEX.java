package Códigos;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/** @author Maximus*/


public class REGEX{
    /**static final para poder trabajar dentro de los metodos, ya que si no 
       lo es no se podra usar dentro de los metodos al ser estatica*/
    // Puntos,simbolos,tildes,espacios,alfabeto

    private static final String PUNTOS ="\\p{Punct}";
    public REGEX(){}
    
    private static final String SIMBOLOS = "([^(\\s)ñ(\\w)]|)";
    private static final String TILDE_A="[áàä]";
    private static final String TILDE_E="[éèë]";
    private static final String TILDE_I="[íìï]";
    private static final String TILDE_O="[óòö]";
    private static final String TILDE_U="[úùü]";
    private static final String ESPACIO="\\b";
    private static final String ALFABETO ="[a-z]";
    private static final String ALFABETO_SUFIJOS ="[a-z]"; 
    private static final String DIGITOS ="\\d";
    
    
    //Regex para prefijos
    private static final String PREFIJO1 =ESPACIO+"a[n*]?"+ALFABETO+"*";
    private static final String PREFIJO2 =ESPACIO+"bi[s*]?"+ALFABETO+"*";
    private static final String PREFIJO3 =ESPACIO+"ant[ei]"+ALFABETO+"*";
    private static final String PREFIJO4 =ESPACIO+"co[n*]?"+ALFABETO+"*";
    private static final String PREFIJO5 =ESPACIO+"en"+ALFABETO+"*";
    private static final String PREFIJO6 =ESPACIO+"entre?"+ALFABETO+"*";
    private static final String PREFIJO8 =ESPACIO+"extra"+ALFABETO+"*";
    private static final String PREFIJO7 =ESPACIO+"ex"+ALFABETO+"*";
    private static final String PREFIJO9 =ESPACIO+"hip(er)"+ALFABETO+"*";
    private static final String PREFIJO10 =ESPACIO+"pos(t*)"+ALFABETO+"*";
    private static final String PREFIJO11 =ESPACIO+"(p*)re"+ALFABETO+"*";
    private static final String PREFIJO12 =ESPACIO+"sub"+ALFABETO+"*";
    private static final String PREFIJO13 =ESPACIO+"super"+ALFABETO+"*";
    private static final String PREFIJO14 =ESPACIO+"hip(o)"+ALFABETO+"*";
    
    //Regex para sufijos de adjetivos
    private static final String ADJETIVO1 =ALFABETO_SUFIJOS+"([ai]ble)"+ESPACIO;
    private static final String ADJETIVO2 =ALFABETO_SUFIJOS+"([ai]do)"+ESPACIO;
    private static final String ADJETIVO3 =ALFABETO_SUFIJOS+"([ia]no)"+ESPACIO;
    private static final String ADJETIVO4 =ALFABETO_SUFIJOS+"(a[lr])"+ESPACIO;
    private static final String ADJETIVO5 =ALFABETO_SUFIJOS+"(ense)"+ESPACIO;
    private static final String ADJETIVO6 =ALFABETO_SUFIJOS+"(eño)"+ESPACIO;
    private static final String ADJETIVO7 =ALFABETO_SUFIJOS+"(iento)"+ESPACIO;
    private static final String ADJETIVO8 =ALFABETO_SUFIJOS+"(il)"+ESPACIO;
    private static final String ADJETIVO9 =ALFABETO_SUFIJOS+"(i[nz]o)"+ESPACIO;
    private static final String ADJETIVO10 =ALFABETO_SUFIJOS+"(oso)"+ESPACIO;
    private static final String ADJETIVO11 =ALFABETO_SUFIJOS+"(udo)"+ESPACIO;
    
    //Regex para sufijos de sustantivos
    private static final String SUSTANTIVO1 =ALFABETO_SUFIJOS+"(aje)"+ESPACIO;
    private static final String SUSTANTIVO2 =ALFABETO_SUFIJOS+"([ae]ncia)"+ESPACIO;
    private static final String SUSTANTIVO3 =ALFABETO_SUFIJOS+"(ante)"+ESPACIO;
    private static final String SUSTANTIVO4 =ALFABETO_SUFIJOS+"(a[lr])"+ESPACIO;
    private static final String SUSTANTIVO5 =ALFABETO_SUFIJOS+"(ario)"+ESPACIO;
    private static final String SUSTANTIVO6 =ALFABETO_SUFIJOS+"(dad)"+ESPACIO;
    private static final String SUSTANTIVO7 =ALFABETO_SUFIJOS+"(eria)"+ESPACIO;
    private static final String SUSTANTIVO8 =ALFABETO_SUFIJOS+"(ero)"+ESPACIO;
    private static final String SUSTANTIVO9 =ALFABETO_SUFIJOS+"(ez)"+ESPACIO;
    private static final String SUSTANTIVO10 =ALFABETO_SUFIJOS+"(ista)"+ESPACIO;
    private static final String SUSTANTIVO11 =ALFABETO_SUFIJOS+"(ura)"+ESPACIO;

    //Regex para sufijos aumentativos
    private static final String AUMENTATIVO1 =ALFABETO_SUFIJOS+"(azo)"+ESPACIO;
    private static final String AUMENTATIVO2 =ALFABETO_SUFIJOS+"(on)"+ESPACIO;
    private static final String AUMENTATIVO3 =ALFABETO_SUFIJOS+"(ote)"+ESPACIO;

    //Regex para sufijos disminutivos
    private static final String DISMINUTIVO1 =ALFABETO_SUFIJOS+"([cz]?i[ct][oa])"+ESPACIO;
    private static final String DISMINUTIVO2 =ALFABETO_SUFIJOS+"([cz]?illo)"+ESPACIO;
    private static final String DISMINUTIVO3 =ALFABETO_SUFIJOS+"([cz]?in)"+ESPACIO;
    private static final String DISMINUTIVO4 =ALFABETO_SUFIJOS+"([cz]?uelo)"+ESPACIO;
    
    //Regex para sufijos despectivos
    private static final String DESPECTIVO1 =ALFABETO_SUFIJOS+"(acho)"+ESPACIO;
    private static final String DESPECTIVO2 =ALFABETO_SUFIJOS+"(aco)"+ESPACIO;
    private static final String DESPECTIVO3 =ALFABETO_SUFIJOS+"(ajo)"+ESPACIO;
    private static final String DESPECTIVO4 =ALFABETO_SUFIJOS+"(astro)"+ESPACIO;
    private static final String DESPECTIVO5 =ALFABETO_SUFIJOS+"(ucho)"+ESPACIO;
    
    
    //Regex para sufijos de verbos
    private static final String VERBO1 =ALFABETO_SUFIJOS+"(ear)"+ESPACIO;
    private static final String VERBO2 =ALFABETO_SUFIJOS+"(ecer)"+ESPACIO;
    private static final String VERBO3 =ALFABETO_SUFIJOS+"(ificar)"+ESPACIO;
    private static final String VERBO4 =ALFABETO_SUFIJOS+"(izar)"+ESPACIO;
    
    
    //Regex articulos
    private static final String ARTICULO1 =ESPACIO+"(e[nl])"+ESPACIO;
    private static final String ARTICULO2 =ESPACIO+"(la(s?))"+ESPACIO;
    private static final String ARTICULO3 =ESPACIO+"(lo(s?))"+ESPACIO;
    private static final String ARTICULO4 =ESPACIO+"(un)"+ESPACIO;
    private static final String ARTICULO5 =ESPACIO+"(unas)"+ESPACIO;
    private static final String ARTICULO6 =ESPACIO+"(unos)"+ESPACIO;
    private static final String ARTICULO7 =ESPACIO+"(una)"+ESPACIO;
    
    //Regex pronombres
    private static final String PRONOMBRE1 =ESPACIO+"est([ea?]s?)"+ESPACIO;
    private static final String PRONOMBRE2 =ESPACIO+"esto"+ESPACIO;
    private static final String PRONOMBRE3 =ESPACIO+"es([oa?]s?)"+ESPACIO;
    private static final String PRONOMBRE4 =ESPACIO+"es"+ESPACIO;
    private static final String PRONOMBRE5 =ESPACIO+"aquell[oa]s?"+ESPACIO;
    private static final String PRONOMBRE6 =ESPACIO+"aquel"+ESPACIO;
    private static final String PRONOMBRE7 =ESPACIO+"[vn?]uestr[ao?]s?"+ESPACIO;
    private static final String PRONOMBRE8 =ESPACIO+"mi[oa?]s?"+ESPACIO;
    private static final String PRONOMBRE9 =ESPACIO+"un[ao]s?"+ESPACIO;
    private static final String PRONOMBRE10 =ESPACIO+"dos"+ESPACIO;
    private static final String PRONOMBRE11 =ESPACIO+"tres"+ESPACIO;
    private static final String PRONOMBRE12 =ESPACIO+"cuatro"+ESPACIO;
    private static final String PRONOMBRE13 =ESPACIO+"tercer[ao]?s?"+ESPACIO;
    private static final String PRONOMBRE14 =ESPACIO+"primer[ao]?s?"+ESPACIO;
    private static final String PRONOMBRE15 =ESPACIO+"segund[ao]s?"+ESPACIO;
    private static final String PRONOMBRE16 =ESPACIO+"(ningun)[oa]?s?"+ESPACIO;
    private static final String PRONOMBRE17 =ESPACIO+"(algun)[oa]?s?"+ESPACIO;
    private static final String PRONOMBRE18 =ESPACIO+"(un)[oa]?s?"+ESPACIO;
    private static final String PRONOMBRE19 =ESPACIO+"otr[ao]s?"+ESPACIO;
    private static final String PRONOMBRE20 =ESPACIO+"poc[ao]s?"+ESPACIO;
    private static final String PRONOMBRE21 =ESPACIO+"tod[ao]s?"+ESPACIO;
    private static final String PRONOMBRE22 =ESPACIO+"much[ao]s?"+ESPACIO;
    private static final String PRONOMBRE23 =ESPACIO+"vari[oa]s"+ESPACIO;
    private static final String PRONOMBRE24 =ESPACIO+"para"+ESPACIO;
    private static final String PRONOMBRE25 =ESPACIO+"nadie"+ESPACIO;
    private static final String PRONOMBRE26 =ESPACIO+"nada"+ESPACIO;
    private static final String PRONOMBRE27 =ESPACIO+"algo"+ESPACIO;
    private static final String PRONOMBRE28 =ESPACIO+"alguien"+ESPACIO;
    private static final String PRONOMBRE29 =ESPACIO+"bastantes?"+ESPACIO;
    private static final String PRONOMBRE30 =ESPACIO+"yo"+ESPACIO;
    private static final String PRONOMBRE31 =ESPACIO+"m[ei]"+ESPACIO;
    private static final String PRONOMBRE32 =ESPACIO+"con[ms]igo"+ESPACIO;
    private static final String PRONOMBRE33 =ESPACIO+"(vosotr)[ao]s"+ESPACIO;
    private static final String PRONOMBRE34 =ESPACIO+"(nosotr)[ao]s"+ESPACIO;
    private static final String PRONOMBRE35 =ESPACIO+"t[uei]"+ESPACIO;
    private static final String PRONOMBRE36 =ESPACIO+"ell[ao]s?"+ESPACIO;
    private static final String PRONOMBRE37 =ESPACIO+"el"+ESPACIO;
    private static final String PRONOMBRE38 =ESPACIO+"s[ei]"+ESPACIO;
    private static final String PRONOMBRE39 =ESPACIO+"l[aoe]s?"+ESPACIO;
    private static final String PRONOMBRE40 =ESPACIO+"[ts]uy[oa]s?"+ESPACIO;
    
    public String DeletePrefijos(String TEXTO){
            String LineaTexto;
            //Asignando los Pattern
            Pattern P_prefijo1 =Pattern.compile(PREFIJO1);
            Pattern P_prefijo2 =Pattern.compile(PREFIJO2);
            Pattern P_prefijo3 =Pattern.compile(PREFIJO3);
            Pattern P_prefijo4 =Pattern.compile(PREFIJO4);
            Pattern P_prefijo5 =Pattern.compile(PREFIJO5);
            Pattern P_prefijo6 =Pattern.compile(PREFIJO6);
            Pattern P_prefijo7 =Pattern.compile(PREFIJO7);
            Pattern P_prefijo8 =Pattern.compile(PREFIJO8);
            Pattern P_prefijo9 =Pattern.compile(PREFIJO9);
            Pattern P_prefijo10 =Pattern.compile(PREFIJO10);
            Pattern P_prefijo11 =Pattern.compile(PREFIJO11);
            Pattern P_prefijo12 =Pattern.compile(PREFIJO12);
            Pattern P_prefijo13 =Pattern.compile(PREFIJO13);
            Pattern P_prefijo14 =Pattern.compile(PREFIJO14);

            //Buscando coincidencias y eliminandolas del texto para cada caso
            Matcher COINCIDE = P_prefijo1.matcher(TEXTO);
            LineaTexto = COINCIDE.replaceAll("");

            COINCIDE = P_prefijo2.matcher(LineaTexto);
            LineaTexto = COINCIDE.replaceAll("");

            COINCIDE = P_prefijo3.matcher(LineaTexto);
            LineaTexto = COINCIDE.replaceAll("");

            COINCIDE = P_prefijo4.matcher(LineaTexto);
            LineaTexto = COINCIDE.replaceAll("");

            COINCIDE = P_prefijo5.matcher(LineaTexto);
            LineaTexto = COINCIDE.replaceAll("");

            COINCIDE = P_prefijo6.matcher(LineaTexto);
            LineaTexto = COINCIDE.replaceAll("");

            COINCIDE = P_prefijo7.matcher(LineaTexto);
            LineaTexto = COINCIDE.replaceAll("");

            COINCIDE = P_prefijo8.matcher(LineaTexto);
            LineaTexto = COINCIDE.replaceAll("");

            COINCIDE = P_prefijo9.matcher(LineaTexto);
            LineaTexto = COINCIDE.replaceAll("");

            COINCIDE = P_prefijo10.matcher(LineaTexto);
            LineaTexto = COINCIDE.replaceAll("");

            COINCIDE = P_prefijo11.matcher(LineaTexto);
            LineaTexto = COINCIDE.replaceAll("");

            COINCIDE = P_prefijo12.matcher(LineaTexto);
            LineaTexto = COINCIDE.replaceAll("");

            COINCIDE = P_prefijo13.matcher(LineaTexto);
            LineaTexto = COINCIDE.replaceAll("");
            
            COINCIDE = P_prefijo14.matcher(LineaTexto);
            LineaTexto = COINCIDE.replaceAll("");
            return LineaTexto;

    }
	
    public String DeleteSufijos(String TEXTO){
            String LineaTexto;
            //Asignando los Pattern de adjetivos
            Pattern P_adjetivo1 =Pattern.compile(ADJETIVO1);
            Pattern P_adjetivo2 =Pattern.compile(ADJETIVO2);
            Pattern P_adjetivo3 =Pattern.compile(ADJETIVO3);
            Pattern P_adjetivo4 =Pattern.compile(ADJETIVO4);
            Pattern P_adjetivo5 =Pattern.compile(ADJETIVO5);
            Pattern P_adjetivo6 =Pattern.compile(ADJETIVO6);
            Pattern P_adjetivo7 =Pattern.compile(ADJETIVO7);
            Pattern P_adjetivo8 =Pattern.compile(ADJETIVO8);
            Pattern P_adjetivo9 =Pattern.compile(ADJETIVO9);
            Pattern P_adjetivo10 =Pattern.compile(ADJETIVO10);
            Pattern P_adjetivo11 =Pattern.compile(ADJETIVO11);

            //Asignando los Pattern de sustantivos
            Pattern P_sustantivo1 =Pattern.compile(SUSTANTIVO1);
            Pattern P_sustantivo2 =Pattern.compile(SUSTANTIVO2);
            Pattern P_sustantivo3 =Pattern.compile(SUSTANTIVO3);
            Pattern P_sustantivo4 =Pattern.compile(SUSTANTIVO4);
            Pattern P_sustantivo5 =Pattern.compile(SUSTANTIVO5);
            Pattern P_sustantivo6 =Pattern.compile(SUSTANTIVO6);
            Pattern P_sustantivo7 =Pattern.compile(SUSTANTIVO7);
            Pattern P_sustantivo8 =Pattern.compile(SUSTANTIVO8);
            Pattern P_sustantivo9 =Pattern.compile(SUSTANTIVO9);
            Pattern P_sustantivo10 =Pattern.compile(SUSTANTIVO10);
            Pattern P_sustantivo11 =Pattern.compile(SUSTANTIVO11);

            //Asignando los Pattern de aumentivos
            Pattern P_aumentativo1 =Pattern.compile(AUMENTATIVO1);
            Pattern P_aumentativo2 =Pattern.compile(AUMENTATIVO2);
            Pattern P_aumentativo3 =Pattern.compile(AUMENTATIVO3);

            //Asignando los Pattern de disminutivos
            Pattern P_disminutivo1 =Pattern.compile(DISMINUTIVO1);
            Pattern P_disminutivo2 =Pattern.compile(DISMINUTIVO2);
            Pattern P_disminutivo3 =Pattern.compile(DISMINUTIVO3);
            Pattern P_disminutivo4 =Pattern.compile(DISMINUTIVO4);

            //Asignando los Pattern de despectivos
            Pattern P_despectivo1 =Pattern.compile(DESPECTIVO1);
            Pattern P_despectivo2 =Pattern.compile(DESPECTIVO2);
            Pattern P_despectivo3 =Pattern.compile(DESPECTIVO3);
            Pattern P_despectivo4 =Pattern.compile(DESPECTIVO4);
            Pattern P_despectivo5 =Pattern.compile(DESPECTIVO5);

            //Asignando los Pattern de verbos
            Pattern P_verbo1 =Pattern.compile(VERBO1);
            Pattern P_verbo2 =Pattern.compile(VERBO2);
            Pattern P_verbo3 =Pattern.compile(VERBO3);
            Pattern P_verbo4 =Pattern.compile(VERBO4);



            //Buscando coincidencias y eliminandolas del texto para cada caso       
            Matcher COINCIDE = P_verbo1.matcher(TEXTO);
            LineaTexto = COINCIDE.replaceAll("");
            COINCIDE = P_verbo2.matcher(LineaTexto);
            LineaTexto = COINCIDE.replaceAll("");
            COINCIDE = P_verbo3.matcher(LineaTexto);
            LineaTexto = COINCIDE.replaceAll("");
            COINCIDE = P_verbo4.matcher(LineaTexto);
            LineaTexto = COINCIDE.replaceAll("");

            
            
            COINCIDE = P_adjetivo1.matcher(LineaTexto);
            LineaTexto = COINCIDE.replaceAll("");
            COINCIDE = P_adjetivo2.matcher(LineaTexto);
            LineaTexto = COINCIDE.replaceAll("");
            COINCIDE = P_adjetivo3.matcher(LineaTexto);
            LineaTexto = COINCIDE.replaceAll("");
            COINCIDE = P_adjetivo4.matcher(LineaTexto);
            LineaTexto = COINCIDE.replaceAll("");
            COINCIDE = P_adjetivo5.matcher(LineaTexto);
            LineaTexto = COINCIDE.replaceAll("");
            COINCIDE = P_adjetivo6.matcher(LineaTexto);
            LineaTexto = COINCIDE.replaceAll("");
            COINCIDE = P_adjetivo7.matcher(LineaTexto);
            LineaTexto = COINCIDE.replaceAll("");
            COINCIDE = P_adjetivo8.matcher(LineaTexto);
            LineaTexto = COINCIDE.replaceAll("");
            COINCIDE = P_adjetivo9.matcher(LineaTexto);
            LineaTexto = COINCIDE.replaceAll("");
            COINCIDE = P_adjetivo10.matcher(LineaTexto);
            LineaTexto = COINCIDE.replaceAll("");
            COINCIDE = P_adjetivo11.matcher(LineaTexto);
            LineaTexto = COINCIDE.replaceAll("");

            COINCIDE = P_sustantivo1.matcher(LineaTexto);
            LineaTexto = COINCIDE.replaceAll("");
            COINCIDE = P_sustantivo2.matcher(LineaTexto);
            LineaTexto = COINCIDE.replaceAll("");
            COINCIDE = P_sustantivo3.matcher(LineaTexto);
            LineaTexto = COINCIDE.replaceAll("");
            COINCIDE = P_sustantivo4.matcher(LineaTexto);
            LineaTexto = COINCIDE.replaceAll("");
            COINCIDE = P_sustantivo5.matcher(LineaTexto);
            LineaTexto = COINCIDE.replaceAll("");
            COINCIDE = P_sustantivo6.matcher(LineaTexto);
            LineaTexto = COINCIDE.replaceAll("");
            COINCIDE = P_sustantivo7.matcher(LineaTexto);
            LineaTexto = COINCIDE.replaceAll("");
            COINCIDE = P_sustantivo8.matcher(LineaTexto);
            LineaTexto = COINCIDE.replaceAll("");
            COINCIDE = P_sustantivo9.matcher(LineaTexto);
            LineaTexto = COINCIDE.replaceAll("");
            COINCIDE = P_sustantivo10.matcher(LineaTexto);
            LineaTexto = COINCIDE.replaceAll("");
            COINCIDE = P_sustantivo11.matcher(LineaTexto);
            LineaTexto = COINCIDE.replaceAll("");


            COINCIDE = P_aumentativo1.matcher(LineaTexto);
            LineaTexto = COINCIDE.replaceAll("");
            COINCIDE = P_aumentativo2.matcher(LineaTexto);
            LineaTexto = COINCIDE.replaceAll("");
            COINCIDE = P_aumentativo3.matcher(LineaTexto);
            LineaTexto = COINCIDE.replaceAll("");


            COINCIDE = P_disminutivo1.matcher(LineaTexto);
            LineaTexto = COINCIDE.replaceAll("");
            COINCIDE = P_disminutivo2.matcher(LineaTexto);
            LineaTexto = COINCIDE.replaceAll("");
            COINCIDE = P_disminutivo3.matcher(LineaTexto);
            LineaTexto = COINCIDE.replaceAll("");
            COINCIDE = P_disminutivo4.matcher(LineaTexto);
            LineaTexto = COINCIDE.replaceAll("");


            COINCIDE = P_despectivo1.matcher(LineaTexto);
            LineaTexto = COINCIDE.replaceAll("");
            COINCIDE = P_despectivo2.matcher(LineaTexto);
            LineaTexto = COINCIDE.replaceAll("");
            COINCIDE = P_despectivo3.matcher(LineaTexto);
            LineaTexto = COINCIDE.replaceAll("");
            COINCIDE = P_despectivo4.matcher(LineaTexto);
            LineaTexto = COINCIDE.replaceAll("");
            COINCIDE = P_despectivo5.matcher(LineaTexto);
            LineaTexto = COINCIDE.replaceAll("");


            return LineaTexto;

    }

    public String DeleteArticulosYPronombres(String TEXTO){
		String LineaTexto;
		//Asignando los Pattern
		Pattern P_articulo1 =Pattern.compile(ARTICULO1);
		Pattern P_articulo2 =Pattern.compile(ARTICULO2);
		Pattern P_articulo3 =Pattern.compile(ARTICULO3);
		Pattern P_articulo4 =Pattern.compile(ARTICULO4);
		Pattern P_articulo5 =Pattern.compile(ARTICULO5);
		Pattern P_articulo6 =Pattern.compile(ARTICULO6);
		Pattern P_articulo7 =Pattern.compile(ARTICULO7);
		
		Pattern P_pronombre1 =Pattern.compile(PRONOMBRE1);
		Pattern P_pronombre2 =Pattern.compile(PRONOMBRE2);
		Pattern P_pronombre3 =Pattern.compile(PRONOMBRE3);
		Pattern P_pronombre4 =Pattern.compile(PRONOMBRE4);
		Pattern P_pronombre5 =Pattern.compile(PRONOMBRE5);
		Pattern P_pronombre6 =Pattern.compile(PRONOMBRE6);
		Pattern P_pronombre7 =Pattern.compile(PRONOMBRE7);
		Pattern P_pronombre8 =Pattern.compile(PRONOMBRE8);
		Pattern P_pronombre9 =Pattern.compile(PRONOMBRE9);
		Pattern P_pronombre10 =Pattern.compile(PRONOMBRE10);
		Pattern P_pronombre11 =Pattern.compile(PRONOMBRE11);
		Pattern P_pronombre12 =Pattern.compile(PRONOMBRE12);
		Pattern P_pronombre13 =Pattern.compile(PRONOMBRE13);
		Pattern P_pronombre14 =Pattern.compile(PRONOMBRE14);
		Pattern P_pronombre15 =Pattern.compile(PRONOMBRE15);
		Pattern P_pronombre16 =Pattern.compile(PRONOMBRE16);
		Pattern P_pronombre17 =Pattern.compile(PRONOMBRE17);
		Pattern P_pronombre18 =Pattern.compile(PRONOMBRE18);
		Pattern P_pronombre19 =Pattern.compile(PRONOMBRE19);
		Pattern P_pronombre20 =Pattern.compile(PRONOMBRE20);
		Pattern P_pronombre21 =Pattern.compile(PRONOMBRE21);
		Pattern P_pronombre22 =Pattern.compile(PRONOMBRE22);
		Pattern P_pronombre23 =Pattern.compile(PRONOMBRE23);
		Pattern P_pronombre24 =Pattern.compile(PRONOMBRE24);
		Pattern P_pronombre25 =Pattern.compile(PRONOMBRE25);
		Pattern P_pronombre26 =Pattern.compile(PRONOMBRE26);
		Pattern P_pronombre27 =Pattern.compile(PRONOMBRE27);
		Pattern P_pronombre28 =Pattern.compile(PRONOMBRE28);
		Pattern P_pronombre29 =Pattern.compile(PRONOMBRE29);
		Pattern P_pronombre30 =Pattern.compile(PRONOMBRE30);
		Pattern P_pronombre31 =Pattern.compile(PRONOMBRE31);
		Pattern P_pronombre32 =Pattern.compile(PRONOMBRE32);
		Pattern P_pronombre33 =Pattern.compile(PRONOMBRE33);
		Pattern P_pronombre34 =Pattern.compile(PRONOMBRE34);
		Pattern P_pronombre35 =Pattern.compile(PRONOMBRE35);
		Pattern P_pronombre36 =Pattern.compile(PRONOMBRE36);
		Pattern P_pronombre37 =Pattern.compile(PRONOMBRE37);
		Pattern P_pronombre38 =Pattern.compile(PRONOMBRE38);
		Pattern P_pronombre39 =Pattern.compile(PRONOMBRE39);
		Pattern P_pronombre40 =Pattern.compile(PRONOMBRE40);
		
		//Buscando coincidencias y eliminandolas del texto para cada caso
		Matcher COINCIDE = P_articulo1.matcher(TEXTO);
                LineaTexto = COINCIDE.replaceAll("");
		COINCIDE = P_articulo2.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("");
		COINCIDE = P_articulo3.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("");
		COINCIDE = P_articulo4.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("");
		COINCIDE = P_articulo5.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("");
		COINCIDE = P_articulo6.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("");
		COINCIDE = P_articulo7.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("");
		
		
		
		
		COINCIDE = P_pronombre1.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("");
		COINCIDE = P_pronombre2.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("");
		COINCIDE = P_pronombre3.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("");
		COINCIDE = P_pronombre4.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("");
		COINCIDE = P_pronombre5.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("");
		COINCIDE = P_pronombre6.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("");
		COINCIDE = P_pronombre7.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("");
		COINCIDE = P_pronombre8.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("");
		COINCIDE = P_pronombre9.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("");
		COINCIDE = P_pronombre10.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("");
		COINCIDE = P_pronombre11.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("");
		COINCIDE = P_pronombre12.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("");
		COINCIDE = P_pronombre13.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("");
		COINCIDE = P_pronombre14.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("");
		COINCIDE = P_pronombre15.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("");
		COINCIDE = P_pronombre16.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("");
		COINCIDE = P_pronombre17.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("");
		COINCIDE = P_pronombre18.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("");
		COINCIDE = P_pronombre19.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("");
		COINCIDE = P_pronombre20.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("");
		COINCIDE = P_pronombre21.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("");
		COINCIDE = P_pronombre22.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("");
		COINCIDE = P_pronombre23.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("");
		COINCIDE = P_pronombre24.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("");
		COINCIDE = P_pronombre25.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("");
		COINCIDE = P_pronombre26.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("");
		COINCIDE = P_pronombre27.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("");
		COINCIDE = P_pronombre28.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("");
		COINCIDE = P_pronombre29.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("");
		COINCIDE = P_pronombre30.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("");
		COINCIDE = P_pronombre31.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("");
		COINCIDE = P_pronombre32.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("");
		COINCIDE = P_pronombre33.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("");
		COINCIDE = P_pronombre34.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("");
		COINCIDE = P_pronombre35.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("");
		COINCIDE = P_pronombre36.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("");
		COINCIDE = P_pronombre37.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("");
		COINCIDE = P_pronombre38.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("");
		COINCIDE = P_pronombre39.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("");
                COINCIDE = P_pronombre40.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("");
                
		
		
		
		return LineaTexto;
		
	}
	
    public String DeleteBasura(String TEXTO){
		String LineaTexto;
		//Asignando los Pattern
		
		Pattern P_puntos =Pattern.compile(PUNTOS);
		Pattern P_simbolos =Pattern.compile(SIMBOLOS);
                //Pattern P_simbolos = Pattern.compile("(\\s)*[.,\\/#!$%\\^&\\*;:{}=\\-_`~()â€?â€œ\"â€¦?Â¿!Â¡\\[\\]\\\\](\\s)*");
		Pattern P_digitos =Pattern.compile(DIGITOS);
		Pattern P_basura = Pattern.compile(ESPACIO+"[a-z][a-z]?"+ESPACIO);
		
		//Eliminando simbolos, digitos y puntos
		
		Matcher COINCIDE = P_puntos.matcher(TEXTO);
                LineaTexto = COINCIDE.replaceAll("");
		COINCIDE = P_simbolos.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("");
		COINCIDE = P_digitos.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("");
                COINCIDE = P_digitos.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("");
                COINCIDE = P_basura.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("");
                LineaTexto = COINCIDE.replaceAll("");
		return LineaTexto;
		
	}
	
    public String RemplazoTildes(String TEXTO){
		String LineaTexto;
                
                //Asignando los Pattern
		Pattern P_tildeA =Pattern.compile(TILDE_A);
		Pattern P_tildeE =Pattern.compile(TILDE_E);
		Pattern P_tildeI =Pattern.compile(TILDE_I);
		Pattern P_tildeO =Pattern.compile(TILDE_O);
		Pattern P_tildeU =Pattern.compile(TILDE_U);
		
		//Remplazando las letras con tilde a otras sin tilde
		Matcher COINCIDE = P_tildeA.matcher(TEXTO);
                LineaTexto = COINCIDE.replaceAll("a");
		
		COINCIDE = P_tildeE.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("e");
		
		COINCIDE = P_tildeI.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("i");
		
		COINCIDE = P_tildeO.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("o");
		
		COINCIDE = P_tildeU.matcher(LineaTexto);
                LineaTexto = COINCIDE.replaceAll("u");
		
		return LineaTexto;
                
	}
    public String EliminarCosasIrrelevantes(String TEXTO){
		String LineaTexto;
                
                //Asignando los Pattern
		Pattern P_irrelevante =Pattern.compile(ESPACIO+"que|del|por"+ESPACIO);

		//Remplazando las letras con tilde a otras sin tilde
		Matcher COINCIDE = P_irrelevante.matcher(TEXTO);
                LineaTexto = COINCIDE.replaceAll("");
                
		return LineaTexto;
                
	}
	
    
}