/* The following code was generated by JFlex 1.7.0 */

package min_c;
import java_cup.runtime.Symbol;
import java_cup.runtime.*;
import java.util.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>Project.jflex</tt>
 */
class LexicalElements implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int BLOCK_COMMENT = 2;
  public static final int BLOCK_COMMENT_SEGMENT = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2, 2
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\10\1\6\1\63\1\63\1\7\22\0\1\5\1\14\1\32"+
    "\1\14\1\14\1\14\1\17\1\13\1\26\1\27\1\23\1\24\1\11"+
    "\1\25\1\31\1\21\12\2\1\12\1\30\1\22\1\20\1\22\1\14"+
    "\1\14\1\54\1\37\1\42\1\51\1\55\1\56\1\47\1\43\1\34"+
    "\2\1\1\41\1\53\1\35\1\40\1\62\1\1\1\44\1\46\1\36"+
    "\1\60\1\50\1\61\1\57\2\1\1\3\1\0\1\4\1\14\1\1"+
    "\1\0\1\54\1\37\1\42\1\51\1\55\1\56\1\47\1\43\1\34"+
    "\2\1\1\41\1\53\1\35\1\40\1\62\1\1\1\44\1\46\1\36"+
    "\1\60\1\50\1\61\1\57\2\1\1\15\1\52\1\16\7\0\1\63"+
    "\33\0\1\14\216\0\2\33\115\0\1\45\u1ea8\0\1\63\1\63\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\1\2\1\3\1\4\1\5\2\6\1\7"+
    "\1\10\1\1\1\11\1\12\1\1\1\13\1\14\1\15"+
    "\1\14\2\16\1\17\1\20\1\21\2\1\6\2\1\1"+
    "\2\2\1\1\5\2\1\22\1\23\1\24\1\23\1\0"+
    "\1\25\2\0\1\26\1\15\1\27\1\30\4\0\1\31"+
    "\1\0\1\32\1\2\1\32\6\2\2\0\3\2\1\33"+
    "\10\2\1\34\1\35\2\27\2\30\2\36\4\2\1\37"+
    "\1\2\2\0\2\2\1\0\1\2\1\0\1\2\1\0"+
    "\1\2\1\0\1\2\1\40\2\2\1\0\1\2\1\0"+
    "\1\2\2\0\1\41\1\42\1\43\1\0\2\2\2\0"+
    "\2\2\2\44\2\45\2\46\2\47\1\0\2\2\1\0"+
    "\1\2\1\0\1\2\2\50\1\2\1\0\1\51\1\2"+
    "\1\51\2\52\1\2\2\53\1\0\1\2\1\54\2\55"+
    "\1\0\1\2\2\56\1\0\1\2\2\57";

  private static int [] zzUnpackAction() {
    int [] result = new int[168];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\64\0\150\0\234\0\320\0\u0104\0\u0138\0\234"+
    "\0\234\0\u016c\0\234\0\u01a0\0\u01d4\0\234\0\234\0\u0208"+
    "\0\234\0\u023c\0\u0270\0\234\0\234\0\u02a4\0\234\0\234"+
    "\0\234\0\u02d8\0\u030c\0\u0340\0\u0374\0\u03a8\0\u03dc\0\u0410"+
    "\0\u0444\0\u0478\0\u04ac\0\u04e0\0\u0514\0\u0548\0\u057c\0\u05b0"+
    "\0\u05e4\0\u0618\0\234\0\234\0\234\0\u064c\0\u0680\0\234"+
    "\0\u0270\0\u06b4\0\234\0\234\0\u06e8\0\u071c\0\u02d8\0\u0750"+
    "\0\u0784\0\u07b8\0\234\0\u07ec\0\234\0\u0820\0\320\0\u0854"+
    "\0\u0888\0\u08bc\0\u08f0\0\u0924\0\u0958\0\u098c\0\u09c0\0\u09f4"+
    "\0\u0a28\0\u0a5c\0\234\0\u0a90\0\u0ac4\0\u0af8\0\u0b2c\0\u0b60"+
    "\0\u0b94\0\u0bc8\0\u0bfc\0\u0680\0\234\0\u0c30\0\u0c64\0\u0c98"+
    "\0\u0ccc\0\234\0\320\0\u0d00\0\u0d34\0\u0d68\0\u0d9c\0\320"+
    "\0\u0dd0\0\u0e04\0\u0e38\0\u0e6c\0\u0ea0\0\u0ed4\0\u0f08\0\u0f3c"+
    "\0\u0f70\0\u0fa4\0\u0fd8\0\u100c\0\u1040\0\320\0\u1074\0\u10a8"+
    "\0\u10dc\0\u1110\0\u1144\0\u1178\0\u11ac\0\u11e0\0\320\0\320"+
    "\0\320\0\u1214\0\u1248\0\u127c\0\u12b0\0\u12e4\0\u1318\0\u134c"+
    "\0\234\0\320\0\234\0\320\0\234\0\320\0\234\0\320"+
    "\0\u1380\0\u13b4\0\u13e8\0\u141c\0\u1450\0\u1484\0\u14b8\0\234"+
    "\0\320\0\u14ec\0\u1520\0\234\0\u1554\0\320\0\234\0\320"+
    "\0\u1588\0\234\0\320\0\u15bc\0\u15f0\0\320\0\234\0\320"+
    "\0\u1624\0\u1658\0\234\0\320\0\u168c\0\u16c0\0\234\0\320";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[168];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\4\1\5\1\6\1\7\1\10\1\11\1\12\2\11"+
    "\1\13\1\14\1\15\1\4\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\1\4\1\32\1\33\1\34\1\35\1\36\1\37\2\5"+
    "\1\40\1\5\1\41\1\42\1\43\1\5\1\44\1\5"+
    "\1\45\1\46\1\5\1\47\1\50\2\5\1\51\1\52"+
    "\1\53\6\54\1\55\1\53\53\54\1\53\6\54\2\53"+
    "\13\54\1\56\37\54\1\53\65\0\2\5\31\0\11\5"+
    "\1\0\4\5\1\0\10\5\3\0\1\6\26\0\1\57"+
    "\36\0\1\60\66\0\1\11\74\0\1\61\44\0\2\62"+
    "\31\0\11\62\1\0\4\62\1\0\10\62\20\0\1\63"+
    "\64\0\1\64\1\65\1\0\1\66\60\0\1\64\45\0"+
    "\1\6\62\0\2\67\2\0\1\67\3\0\1\67\1\70"+
    "\5\67\1\0\1\71\1\72\3\0\2\67\2\0\1\73"+
    "\1\0\11\67\1\0\4\67\1\0\10\67\36\0\1\74"+
    "\20\0\1\75\6\0\2\5\31\0\1\5\1\76\7\5"+
    "\1\0\4\5\1\0\3\5\1\77\4\5\2\0\2\5"+
    "\31\0\11\5\1\0\4\5\1\0\5\5\1\100\2\5"+
    "\2\0\2\5\31\0\10\5\1\101\1\0\4\5\1\0"+
    "\10\5\2\0\2\5\31\0\4\5\1\102\4\5\1\0"+
    "\4\5\1\0\10\5\2\0\2\5\31\0\4\5\1\103"+
    "\2\5\1\104\1\5\1\0\4\5\1\0\10\5\2\0"+
    "\2\5\31\0\11\5\1\0\4\5\1\0\2\5\1\105"+
    "\5\5\37\0\1\106\3\0\1\107\22\0\2\5\31\0"+
    "\2\5\1\110\3\5\1\111\2\5\1\0\4\5\1\0"+
    "\10\5\2\0\2\5\31\0\4\5\1\112\4\5\1\0"+
    "\4\5\1\0\10\5\53\0\1\113\12\0\2\5\31\0"+
    "\11\5\1\0\4\5\1\0\1\5\1\114\6\5\2\0"+
    "\2\5\31\0\5\5\1\115\3\5\1\0\4\5\1\0"+
    "\4\5\1\116\3\5\2\0\2\5\31\0\4\5\1\117"+
    "\4\5\1\0\4\5\1\0\1\5\1\120\3\5\1\121"+
    "\2\5\2\0\2\5\31\0\7\5\1\122\1\5\1\0"+
    "\4\5\1\0\10\5\2\0\2\5\31\0\10\5\1\123"+
    "\1\0\4\5\1\0\10\5\22\0\1\55\44\0\1\124"+
    "\74\0\1\125\51\0\2\65\2\0\1\65\3\0\1\65"+
    "\1\126\5\65\1\0\2\127\5\65\4\0\11\65\1\0"+
    "\4\65\1\0\10\65\2\0\2\66\2\0\1\66\3\0"+
    "\1\66\1\130\5\66\1\0\2\131\5\66\4\0\11\66"+
    "\1\0\4\66\1\0\10\66\2\0\2\67\2\0\1\67"+
    "\3\0\1\67\1\70\5\67\2\71\1\72\3\0\2\67"+
    "\2\0\1\73\1\0\11\67\1\0\4\67\1\0\10\67"+
    "\21\0\1\67\44\0\2\67\2\0\1\67\3\0\1\67"+
    "\1\70\6\67\1\71\1\72\3\0\2\67\2\0\1\73"+
    "\1\0\11\67\1\0\4\67\1\0\10\67\37\0\1\132"+
    "\26\0\2\5\31\0\2\5\1\133\6\5\1\0\4\5"+
    "\1\0\10\5\2\0\2\5\31\0\5\5\1\134\3\5"+
    "\1\0\4\5\1\0\10\5\2\0\2\5\31\0\11\5"+
    "\1\0\4\5\1\0\5\5\1\135\2\5\2\0\2\5"+
    "\31\0\4\5\1\136\4\5\1\0\4\5\1\0\10\5"+
    "\2\0\2\5\31\0\1\5\1\137\7\5\1\0\4\5"+
    "\1\0\10\5\2\0\2\5\31\0\10\5\1\140\1\0"+
    "\4\5\1\0\10\5\2\0\2\5\31\0\2\5\1\141"+
    "\6\5\1\0\4\5\1\0\10\5\45\0\1\142\73\0"+
    "\1\143\10\0\2\5\31\0\10\5\1\144\1\0\4\5"+
    "\1\0\10\5\2\0\2\5\31\0\11\5\1\0\4\5"+
    "\1\0\1\5\1\145\6\5\2\0\2\5\30\0\1\146"+
    "\1\147\10\5\1\0\4\5\1\0\10\5\2\0\2\5"+
    "\30\0\1\150\1\151\10\5\1\0\4\5\1\0\10\5"+
    "\2\0\2\5\31\0\11\5\1\152\1\153\3\5\1\0"+
    "\10\5\2\0\2\5\30\0\1\154\1\155\10\5\1\0"+
    "\4\5\1\0\10\5\2\0\2\5\31\0\10\5\1\156"+
    "\1\0\4\5\1\0\10\5\2\0\2\5\31\0\5\5"+
    "\1\157\3\5\1\0\4\5\1\0\10\5\2\0\2\5"+
    "\31\0\1\5\1\160\7\5\1\0\4\5\1\0\10\5"+
    "\2\0\2\5\30\0\1\161\1\162\10\5\1\0\4\5"+
    "\1\0\10\5\2\0\2\5\30\0\1\163\1\164\10\5"+
    "\1\0\4\5\1\0\10\5\2\0\2\65\2\0\1\65"+
    "\3\0\1\65\1\126\5\65\1\165\2\127\5\65\4\0"+
    "\11\65\1\0\4\65\1\0\10\65\2\0\2\65\2\0"+
    "\1\65\3\0\1\65\1\126\6\65\2\127\5\65\4\0"+
    "\11\65\1\0\4\65\1\0\10\65\2\0\2\66\2\0"+
    "\1\66\3\0\1\66\1\130\5\66\1\166\2\131\5\66"+
    "\4\0\11\66\1\0\4\66\1\0\10\66\2\0\2\66"+
    "\2\0\1\66\3\0\1\66\1\130\6\66\2\131\5\66"+
    "\4\0\11\66\1\0\4\66\1\0\10\66\2\0\2\5"+
    "\31\0\5\5\1\167\3\5\1\0\4\5\1\0\10\5"+
    "\2\0\2\5\31\0\11\5\1\0\4\5\1\0\2\5"+
    "\1\170\5\5\2\0\2\5\31\0\5\5\1\171\3\5"+
    "\1\0\4\5\1\0\10\5\2\0\2\5\31\0\11\5"+
    "\1\172\1\173\3\5\1\0\10\5\2\0\2\5\31\0"+
    "\11\5\1\0\4\5\1\0\5\5\1\174\2\5\34\0"+
    "\2\175\64\0\1\176\27\0\2\5\30\0\1\175\1\177"+
    "\10\5\1\0\4\5\1\0\10\5\2\0\2\5\31\0"+
    "\1\5\1\200\7\5\1\0\4\5\1\0\10\5\52\0"+
    "\1\201\13\0\2\5\31\0\11\5\1\0\3\5\1\202"+
    "\1\0\10\5\36\0\1\203\27\0\2\5\31\0\1\5"+
    "\1\204\7\5\1\0\4\5\1\0\10\5\56\0\1\205"+
    "\7\0\2\5\31\0\11\5\1\0\4\5\1\0\2\5"+
    "\1\206\5\5\37\0\1\207\26\0\2\5\31\0\2\5"+
    "\1\210\6\5\1\0\4\5\1\0\10\5\2\0\2\5"+
    "\31\0\11\5\1\211\1\212\3\5\1\0\10\5\2\0"+
    "\2\5\31\0\6\5\1\213\2\5\1\0\4\5\1\0"+
    "\10\5\42\0\1\214\23\0\2\5\31\0\5\5\1\215"+
    "\3\5\1\0\4\5\1\0\10\5\36\0\1\216\27\0"+
    "\2\5\31\0\1\5\1\217\7\5\1\0\4\5\1\0"+
    "\10\5\21\0\1\65\63\0\1\66\101\0\1\220\26\0"+
    "\2\5\31\0\2\5\1\221\6\5\1\0\4\5\1\0"+
    "\10\5\2\0\2\5\31\0\10\5\1\222\1\0\4\5"+
    "\1\0\10\5\36\0\1\223\104\0\1\224\6\0\2\5"+
    "\31\0\1\5\1\225\7\5\1\0\4\5\1\0\10\5"+
    "\2\0\2\5\31\0\11\5\1\0\4\5\1\0\3\5"+
    "\1\226\4\5\56\0\1\227\7\0\2\5\31\0\11\5"+
    "\1\0\4\5\1\0\2\5\1\230\5\5\2\0\2\5"+
    "\31\0\2\5\1\231\6\5\1\0\4\5\1\0\10\5"+
    "\56\0\1\232\7\0\2\5\31\0\11\5\1\0\4\5"+
    "\1\0\2\5\1\233\5\5\37\0\1\234\26\0\2\5"+
    "\31\0\2\5\1\235\6\5\1\0\4\5\1\0\10\5"+
    "\2\0\2\5\31\0\1\5\1\236\7\5\1\0\4\5"+
    "\1\0\10\5\50\0\1\237\15\0\2\5\31\0\11\5"+
    "\1\0\1\5\1\240\2\5\1\0\10\5\2\0\2\5"+
    "\30\0\1\241\1\242\10\5\1\0\4\5\1\0\10\5"+
    "\57\0\1\243\6\0\2\5\31\0\11\5\1\0\4\5"+
    "\1\0\3\5\1\244\4\5\41\0\1\245\24\0\2\5"+
    "\31\0\4\5\1\246\4\5\1\0\4\5\1\0\10\5"+
    "\36\0\1\247\27\0\2\5\31\0\1\5\1\250\7\5"+
    "\1\0\4\5\1\0\10\5\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5876];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\1\11\3\1\2\11\1\1\1\11\2\1\2\11"+
    "\1\1\1\11\2\1\2\11\1\1\3\11\21\1\3\11"+
    "\1\1\1\0\1\11\2\0\2\11\2\1\4\0\1\11"+
    "\1\0\1\11\10\1\2\0\3\1\1\11\11\1\1\11"+
    "\4\1\1\11\7\1\2\0\2\1\1\0\1\1\1\0"+
    "\1\1\1\0\1\1\1\0\4\1\1\0\1\1\1\0"+
    "\1\1\2\0\3\1\1\0\2\1\2\0\2\1\1\11"+
    "\1\1\1\11\1\1\1\11\1\1\1\11\1\1\1\0"+
    "\2\1\1\0\1\1\1\0\1\1\1\11\2\1\1\0"+
    "\1\11\2\1\1\11\2\1\1\11\1\1\1\0\2\1"+
    "\1\11\1\1\1\0\1\1\1\11\1\1\1\0\1\1"+
    "\1\11\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[168];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
    ArrayList output = new ArrayList();
    public static int erroresLexicos = 0;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  LexicalElements(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 232) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { System.out.println("Error lexico. Caracter illegal: <" + yytext() + ">. Línea: " + (yyline + 1) + ", Columna: " + (yycolumn + 1));
                                       /*output.add("Error lexico. Caracter illegal: <" + yytext() + ">. Línea: " + (yyline + 1) + ", Columna: " + (yycolumn + 1));*/
                            			erroresLexicos++;
            } 
            // fall through
          case 48: break;
          case 2: 
            { return new Symbol(sym.ITSID 	,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 49: break;
          case 3: 
            { return new Symbol(sym.ITSNUMINT 	,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 50: break;
          case 4: 
            { return new Symbol(sym.ITSBRACKET_L 	,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 51: break;
          case 5: 
            { return new Symbol(sym.ITSBRACKET_R 	,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 52: break;
          case 6: 
            { 
            } 
            // fall through
          case 53: break;
          case 7: 
            { return new Symbol(sym.ITSCOMMA 	,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 54: break;
          case 8: 
            { return new Symbol(sym.ITSCOLON 	,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 55: break;
          case 9: 
            { return new Symbol(sym.ITSBRA_L 	,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 56: break;
          case 10: 
            { return new Symbol(sym.ITSBRA_R 	,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 57: break;
          case 11: 
            { return new Symbol(sym.ITSDECLARE 	,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 58: break;
          case 12: 
            { return new Symbol(sym.ITSOPMULT 	,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 59: break;
          case 13: 
            { return new Symbol(sym.ITSOPREL 	,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 60: break;
          case 14: 
            { return new Symbol(sym.ITSOPSUM 	,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 61: break;
          case 15: 
            { return new Symbol(sym.ITSPAR_L	,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 62: break;
          case 16: 
            { return new Symbol(sym.ITSPAR_R 	,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 63: break;
          case 17: 
            { return new Symbol(sym.ITSSEMICOLON 	,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 64: break;
          case 18: 
            { System.out.print(yytext());
            } 
            // fall through
          case 65: break;
          case 19: 
            { /*nothing*/
            } 
            // fall through
          case 66: break;
          case 20: 
            { yybegin(YYINITIAL);
            } 
            // fall through
          case 67: break;
          case 21: 
            { return new Symbol(sym.ITSARRAY 	,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 68: break;
          case 22: 
            { return new Symbol(sym.ITSAND           ,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 69: break;
          case 23: 
            { yybegin(BLOCK_COMMENT);
            } 
            // fall through
          case 70: break;
          case 24: 
            { yybegin(BLOCK_COMMENT_SEGMENT);
            } 
            // fall through
          case 71: break;
          case 25: 
            { return new Symbol(sym.ITSSTRING 	,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 72: break;
          case 26: 
            { return new Symbol(sym.ITSIF 	,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 73: break;
          case 27: 
            { return new Symbol(sym.ITSOR          ,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 74: break;
          case 28: 
            { return new Symbol(sym.ITSFLOAT 	,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 75: break;
          case 29: 
            { return new Symbol(sym.ITSCHARACTER 	,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 76: break;
          case 30: 
            { return new Symbol(sym.ITSINT            ,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 77: break;
          case 31: 
            { return new Symbol(sym.ITSCHAR 	,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 78: break;
          case 32: 
            { return new Symbol(sym.ITSFOR 	,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 79: break;
          case 33: 
            { return new Symbol(sym.ITSNULL 	,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 80: break;
          case 34: 
            { return new Symbol(sym.ITSTRUE 	,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 81: break;
          case 35: 
            { return new Symbol(sym.ITSBOOLEAN            ,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 82: break;
          case 36: 
            { return new Symbol(sym.ITSVOID           ,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 83: break;
          case 37: 
            { return new Symbol(sym.ITSMAIN 	,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 84: break;
          case 38: 
            { return new Symbol(sym.ITSELSE 	,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 85: break;
          case 39: 
            { return new Symbol(sym.ITSEXIT 	,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 86: break;
          case 40: 
            { return new Symbol(sym.ITSCONST 	,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 87: break;
          case 41: 
            { return new Symbol(sym.ITSSCANF 	,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 88: break;
          case 42: 
            { return new Symbol(sym.ITSFALSE 	,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 89: break;
          case 43: 
            { return new Symbol(sym.ITSWHILE 	,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 90: break;
          case 44: 
            { return new Symbol(sym.ITSRETURN 	,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 91: break;
          case 45: 
            { return new Symbol(sym.ITSSTR 	,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 92: break;
          case 46: 
            { return new Symbol(sym.ITSPRINTF 	,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 93: break;
          case 47: 
            { return new Symbol(sym.ITSFUNCTION         ,yyline+1,yycolumn+1,yytext());
            } 
            // fall through
          case 94: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java LexicalElements [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          java.nio.charset.Charset.forName(encodingName); // Side-effect: is encodingName valid? 
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        LexicalElements scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new LexicalElements(reader);
          while ( !scanner.zzAtEOF ) scanner.next_token();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}