package Regex;
import java.util.regex.*;
/** @author Maximus*/


public class Biblioteca_regex {
    /**static final para poder trabajar dentro de los metodos, ya que si no 
       lo es no se podra usar dentro de los metodos al ser estatica*/
    // Puntos,simbolos,tildes,espacios,alfabeto

	//private static final String PUNTOS ="\\p{Punct}";
	
	private static final String SIMBOLOS="([^\s\w]|_)"
	private static final String TILDE_A="á|à|ä";
	private static final String TILDE_E="é|è|ë";
	private static final String TILDE_I="í|ì|ï";
	private static final String TILDE_O="ó|ò|ö";
	private static final String TILDE_U="ú|ù|ü";
	private static final String ESPACIO="\\b";
    private static final String ALFABETO ="(a-z)"; 
    private static final String DIGITOS ="\\d";
    
    
    //Regex para prefijos
    private static final String PREFIJO1 =ESPACIO+"a[n*]?"+ALFABETO+"*";
    private static final String PREFIJO2 =ESPACIO+"bi[s*]?"+ALFABETO+"*";
    private static final String PREFIJO3 =ESPACIO+"ant[ei]"+ALFABETO+"*";
    private static final String PREFIJO4 =ESPACIO+"co[n*]?"+ALFABETO+"*";
    private static final String PREFIJO5 =ESPACIO+"en"+ALFABETO+"*";
    private static final String PREFIJO6 =ESPACIO+"entre?"+ALFABETO+"*";
    private static final String PREFIJO7 =ESPACIO+"ex"+ALFABETO+"*";
    private static final String PREFIJO8 =ESPACIO+"extra"+ALFABETO+"*";
    private static final String PREFIJO9 =ESPACIO+"hip(er|o)"+ALFABETO+"*";
    private static final String PREFIJO10 =ESPACIO+"pos(t*)"+ALFABETO+"*";
    private static final String PREFIJO11 =ESPACIO+"(p*)re"+ALFABETO+"*";
    private static final String PREFIJO12 =ESPACIO+"sub"+ALFABETO+"*";
    private static final String PREFIJO13 =ESPACIO+"super"+ALFABETO+"*";
    
    //Regex para sufijos de adjetivos
    private static final String ADJETIVO1 =ALFABETO+"[ai]ble"+ESPACIO;
    private static final String ADJETIVO2 =ALFABETO+"[ai]do"+ESPACIO;
    private static final String ADJETIVO3 =ALFABETO+"[ia]no"+ESPACIO;
    private static final String ADJETIVO4 =ALFABETO+"a[lr]"+ESPACIO;
    private static final String ADJETIVO5 =ALFABETO+"ense"+ESPACIO;
    private static final String ADJETIVO6 =ALFABETO+"eño"+ESPACIO;
    private static final String ADJETIVO7 =ALFABETO+"iento"+ESPACIO;
    private static final String ADJETIVO8 =ALFABETO+"il"+ESPACIO;
    private static final String ADJETIVO9 =ALFABETO+"i[nz]o"+ESPACIO;
    private static final String ADJETIVO10 =ALFABETO+"oso"+ESPACIO;
    private static final String ADJETIVO11 =ALFABETO+"udo"+ESPACIO;
    
    //Regex para sufijos de sustantivos
    private static final String SUSTANTIVO1 =ALFABETO+"aje"+ESPACIO;
    private static final String SUSTANTIVO2 =ALFABETO+"[ae]ncia"+ESPACIO;
    private static final String SUSTANTIVO3 =ALFABETO+"ante"+ESPACIO;
    private static final String SUSTANTIVO4 =ALFABETO+"a[lr]"+ESPACIO;
    private static final String SUSTANTIVO5 =ALFABETO+"ario"+ESPACIO;
    private static final String SUSTANTIVO6 =ALFABETO+"dad"+ESPACIO;
    private static final String SUSTANTIVO7 =ALFABETO+"eria"+ESPACIO;
    private static final String SUSTANTIVO8 =ALFABETO+"ero"+ESPACIO;
    private static final String SUSTANTIVO9 =ALFABETO+"ez"+ESPACIO;
    private static final String SUSTANTIVO10 =ALFABETO+"ista"+ESPACIO;
    private static final String SUSTANTIVO11 =ALFABETO+"ura"+ESPACIO;

    //Regex para sufijos aumentativos
    private static final String AUMENTATIVO1 =ALFABETO+"azo"+ESPACIO;
    private static final String AUMENTATIVO1 =ALFABETO+"on"+ESPACIO;
    private static final String AUMENTATIVO1 =ALFABETO+"ote"+ESPACIO;

    //Regex para sufijos disminutivos
    private static final String DISMINUTIVO1 =ALFABETO+"[cz]?i[ct][oa]"+ESPACIO;
    private static final String DISMINUTIVO2 =ALFABETO+"[cz]?illo"+ESPACIO;
    private static final String DISMINUTIVO3 =ALFABETO+"[cz]?in"+ESPACIO;
    private static final String DISMINUTIVO4 =ALFABETO+"[cz]?uelo"+ESPACIO;
    
    //Regex para sufijos despectivos
    private static final String DESPECTIVO1 =ALFABETO+"acho"+ESPACIO;
    private static final String DESPECTIVO2 =ALFABETO+"aco"+ESPACIO;
    private static final String DESPECTIVO3 =ALFABETO+"ajo"+ESPACIO;
    private static final String DESPECTIVO4 =ALFABETO+"astro"+ESPACIO;
    private static final String DESPECTIVO5 =ALFABETO+"ucho"+ESPACIO;
    
    
    //Regex para sufijos de verbos
    private static final String VERBO1 =ALFABETO+"ear"+ESPACIO;
    private static final String VERBO2 =ALFABETO+"ecer"+ESPACIO;
    private static final String VERBO3 =ALFABETO+"ificar"+ESPACIO;
    private static final String VERBO4 =ALFABETO+"izar"+ESPACIO;
    
    
    //Regex articulos
    private static final String ARTICULO1 =ESPACIO+"e[nl]"+ESPACIO;
    private static final String ARTICULO2 =ESPACIO+"la(s?)"+ESPACIO;
    private static final String ARTICULO3 =ESPACIO+"lo(s?)"+ESPACIO;
    private static final String ARTICULO4 =ESPACIO+"un(a?|as?|o?|os?)"+ESPACIO;
    
    //Regex pronombres
    private static final String PRONOMBRE1 =ESPACIO+"est([ea?]s?|o)"+ESPACIO;
    private static final String PRONOMBRE2 =ESPACIO+"es([oa?]s?|e)"+ESPACIO;
    private static final String PRONOMBRE3 =ESPACIO+"aquell[oa]s?"+ESPACIO;
    private static final String PRONOMBRE4 =ESPACIO+"aquel"+ESPACIO;
	private static final String PRONOMBRE5 =ESPACIO+"[vn?]uestr[ao?]s?"+ESPACIO;
	private static final String PRONOMBRE6 =ESPACIO+"mi[oa?]s?"+ESPACIO;
	private static final String PRONOMBRE7 =ESPACIO+"(un[ao]s?|dos|tres|cuatro)"+ESPACIO;
	private static final String PRONOMBRE8 =ESPACIO+"tercer[ao]?s?"+ESPACIO;
	private static final String PRONOMBRE9 =ESPACIO+"primer[ao]?s?"+ESPACIO;
	private static final String PRONOMBRE10 =ESPACIO+"segund[ao]s?"+ESPACIO;
	private static final String PRONOMBRE11 =ESPACIO+"(ningun|algun|un)[oa]?s?"+ESPACIO;
	private static final String PRONOMBRE12 =ESPACIO+"otr[ao]s?"+ESPACIO;
    private static final String PRONOMBRE13 =ESPACIO+"poc[ao]s?"+ESPACIO;
	private static final String PRONOMBRE14 =ESPACIO+"tod[ao]s?"+ESPACIO;
	private static final String PRONOMBRE15 =ESPACIO+"much[ao]s?"+ESPACIO;
	private static final String PRONOMBRE16 =ESPACIO+"vari[oa]?s"+ESPACIO;
	private static final String PRONOMBRE17 =ESPACIO+"para|nadie|nada|algo|alguien"+ESPACIO;
	private static final String PRONOMBRE18 =ESPACIO+"bastantes?"+ESPACIO;
	private static final String PRONOMBRE19 =ESPACIO+"yo|m[ei]|con[ms]igo|(vosotr|nosotr)[ao]s|t[uei]"+ESPACIO;
	private static final String PRONOMBRE20 =ESPACIO+"ell[ao]s?|el|s[ei]|l[aoe]s?"+ESPACIO;
	
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
		
		//Buscando coincidencias y eliminandolas del texto para cada caso
		Matcher COINCIDE = P_prefijo1.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		
		Matcher COINCIDE = P_prefijo2.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		
		Matcher COINCIDE = P_prefijo2.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		
		Matcher COINCIDE = P_prefijo3.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		
		Matcher COINCIDE = P_prefijo4.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		
		Matcher COINCIDE = P_prefijo5.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		
		Matcher COINCIDE = P_prefijo6.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		
		Matcher COINCIDE = P_prefijo7.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		
		Matcher COINCIDE = P_prefijo8.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		
		Matcher COINCIDE = P_prefijo9.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		
		Matcher COINCIDE = P_prefijo10.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		
		Matcher COINCIDE = P_prefijo11.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		
		Matcher COINCIDE = P_prefijo12.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		
		Matcher COINCIDE = P_prefijo13.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		
		return LineaTexto;
		
	}
	
	public String DeleteSufijos(String TEXTO){
		String LineaTexto;
		//Asignando los Pattern de adjetivos
		Pattern P_adjetivo1 =Pattern.compile(ADJETIVO1);
		Pattern P_adjetivo2 =Pattern.compile(ADJETIVO1);
		Pattern P_adjetivo3 =Pattern.compile(ADJETIVO1);
		Pattern P_adjetivo4 =Pattern.compile(ADJETIVO1);
		Pattern P_adjetivo5 =Pattern.compile(ADJETIVO1);
		Pattern P_adjetivo6 =Pattern.compile(ADJETIVO1);
		Pattern P_adjetivo7 =Pattern.compile(ADJETIVO1);
		Pattern P_adjetivo8 =Pattern.compile(ADJETIVO1);
		Pattern P_adjetivo9 =Pattern.compile(ADJETIVO1);
		Pattern P_adjetivo10 =Pattern.compile(ADJETIVO1);
		Pattern P_adjetivo11 =Pattern.compile(ADJETIVO1);
		
		//Asignando los Pattern de sustantivos
		Pattern P_sustantivo1 =Pattern.compile(SUSTANTIVO1);
		Pattern P_sustantivo2 =Pattern.compile(SUSTANTIVO1);
		Pattern P_sustantivo3 =Pattern.compile(SUSTANTIVO1);
		Pattern P_sustantivo4 =Pattern.compile(SUSTANTIVO1);
		Pattern P_sustantivo5 =Pattern.compile(SUSTANTIVO1);
		Pattern P_sustantivo6 =Pattern.compile(SUSTANTIVO1);
		Pattern P_sustantivo7 =Pattern.compile(SUSTANTIVO1);
		Pattern P_sustantivo8 =Pattern.compile(SUSTANTIVO1);
		Pattern P_sustantivo9 =Pattern.compile(SUSTANTIVO1);
		Pattern P_sustantivo10 =Pattern.compile(SUSTANTIVO1);
		Pattern P_sustantivo11 =Pattern.compile(SUSTANTIVO1);
		
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
		Matcher COINCIDE = P_adjetivo1.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_adjetivo2.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_adjetivo3.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_adjetivo4.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_adjetivo5.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_adjetivo6.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_adjetivo7.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_adjetivo8.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_adjetivo9.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_adjetivo10.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_adjetivo11.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		
		
		
		
		
		
		Matcher COINCIDE = P_sustantivo1.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_sustantivo2.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_sustantivo3.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_sustantivo4.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_sustantivo5.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_sustantivo6.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_sustantivo7.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_sustantivo8.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_sustantivo9.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_sustantivo1.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll0("");
		Matcher COINCIDE = P_sustantivo1.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll1("");
		
		
		
		Matcher COINCIDE = P_aumentativo1.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_aumentativo2.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_aumentativo3.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		
		
		
		Matcher COINCIDE = P_disminutivo1.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_disminutivo2.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_disminutivo3.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_disminutivo4.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		
		
		
		
		Matcher COINCIDE = P_despectivo1.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_despectivo2.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_despectivo3.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_despectivo4.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_despectivo5.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		
		
		
		Matcher COINCIDE = P_verbo1.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_verbo2.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_verbo3.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_verbo4.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		
	
		return LineaTexto;
		
	}
	
	
	public String DeleteArticulosYPronombres(String TEXTO){
		String LineaTexto;
		//Asignando los Pattern
		Pattern P_articulo1 =Pattern.compile(ARTICULO1);
		Pattern P_articulo2 =Pattern.compile(ARTICULO2);
		Pattern P_articulo3 =Pattern.compile(ARTICULO3);
		
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
		
		
		//Buscando coincidencias y eliminandolas del texto para cada caso
		Matcher COINCIDE = P_articulo1.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_articulo2.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_articulo3.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		
		
		
		
		Matcher COINCIDE = P_pronombre1.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_pronombre2.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_pronombre3.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_pronombre4.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_pronombre5.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_pronombre6.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_pronombre7.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_pronombre8.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_pronombre9.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_pronombre10.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_pronombre11.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_pronombre12.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_pronombre13.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_pronombre14.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_pronombre15.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_pronombre16.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_pronombre17.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_pronombre18.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_pronombre19.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_pronombre20.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		
		
		
		return LineaTexto;
		
	}
	
	public DeleteBasura(String TEXTO){
		String LineaTexto;
		
		//Asignando los Pattern
		
		//Pattern P_puntos =Pattern.compile(PUNTOS);
		Pattern P_simbolos =Pattern.compile(SIMBOLOS);
		Pattern P_digitos =Pattern.compile(DIGITOS);
		
		
		//Eliminando simbolos, digitos y puntos
		
		//Matcher COINCIDE = P_puntos.matcher(TEXTO);
        //LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_simbolos.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		Matcher COINCIDE = P_digitos.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("");
		
		return LineaTexto;
		
	}
	
	public DeleteBasura(String TEXTO){
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
		
		Matcher COINCIDE = P_tildeE.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("e");
		
		Matcher COINCIDE = P_tildeI.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("i");
		
		Matcher COINCIDE = P_tildeO.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("o");
		
		Matcher COINCIDE = P_tildeU.matcher(TEXTO);
        LineaTexto = COINCIDE.replaceAll("u");
		
		return LineaTexto;
	}
	
    
}
