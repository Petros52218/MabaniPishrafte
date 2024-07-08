import java.io.UnsupportedEncodingException;
import java.lang.invoke.MethodHandles;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Strings {

    String s;

    public int length() {
        return s.length();
    }

    public String substring(int beginIndex, int endIndex) {
        return s.substring(beginIndex, endIndex);
    }

    public String stripTrailing() {
        return s.stripTrailing();
    }

    public String repeat(int count) {
        return s.repeat(count);
    }

    public int compareTo(String anotherString) {
        return s.compareTo(anotherString);
    }

    public IntStream chars() {
        return s.chars();
    }

    public String replaceAll(String regex, String replacement) {
        return s.replaceAll(regex, replacement);
    }

    public int codePointBefore(int index) {
        return s.codePointBefore(index);
    }

    public String strip() {
        return s.strip();
    }

    public byte[] getBytes(Charset charset) {
        return s.getBytes(charset);
    }

    public String resolveConstantDesc(MethodHandles.Lookup lookup) {
        return s.resolveConstantDesc(lookup);
    }

    public boolean regionMatches(int toffset, String other, int ooffset, int len) {
        return s.regionMatches(toffset, other, ooffset, len);
    }

    public int indexOf(int ch, int fromIndex) {
        return s.indexOf(ch, fromIndex);
    }

    public String concat(String str) {
        return s.concat(str);
    }

    public char[] toCharArray() {
        return s.toCharArray();
    }

    public int offsetByCodePoints(int index, int codePointOffset) {
        return s.offsetByCodePoints(index, codePointOffset);
    }

    public String[] split(String regex, int limit) {
        return s.split(regex, limit);
    }

    public Stream<String> lines() {
        return s.lines();
    }

    public String toLowerCase() {
        return s.toLowerCase();
    }

    public String formatted(Object... args) {
        return s.formatted(args);
    }

    public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) {
        s.getChars(srcBegin, srcEnd, dst, dstBegin);
    }

    public boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len) {
        return s.regionMatches(ignoreCase, toffset, other, ooffset, len);
    }

    public int lastIndexOf(int ch, int fromIndex) {
        return s.lastIndexOf(ch, fromIndex);
    }

    public String replace(char oldChar, char newChar) {
        return s.replace(oldChar, newChar);
    }

    public int lastIndexOf(String str) {
        return s.lastIndexOf(str);
    }

    public boolean contentEquals(StringBuffer sb) {
        return s.contentEquals(sb);
    }

    public <R> R transform(Function<? super String, ? extends R> f) {
        return s.transform(f);
    }

    public int indexOf(String str, int fromIndex) {
        return s.indexOf(str, fromIndex);
    }

    public boolean contains(CharSequence s) {
        return this.s.contains(s);
    }

    public char charAt(int index) {
        return s.charAt(index);
    }

    public boolean contentEquals(CharSequence cs) {
        return s.contentEquals(cs);
    }

    public boolean startsWith(String prefix) {
        return s.startsWith(prefix);
    }

    public String toUpperCase() {
        return s.toUpperCase();
    }

    public int codePointAt(int index) {
        return s.codePointAt(index);
    }

    public String replace(CharSequence target, CharSequence replacement) {
        return s.replace(target, replacement);
    }

    public IntStream codePoints() {
        return s.codePoints();
    }

    public byte[] getBytes(String charsetName) throws UnsupportedEncodingException {
        return s.getBytes(charsetName);
    }

    public boolean equalsIgnoreCase(String anotherString) {
        return s.equalsIgnoreCase(anotherString);
    }

    public boolean endsWith(String suffix) {
        return s.endsWith(suffix);
    }

    public String intern() {
        return s.intern();
    }

    public int compareToIgnoreCase(String str) {
        return s.compareToIgnoreCase(str);
    }

    public String substring(int beginIndex) {
        return s.substring(beginIndex);
    }

    public Optional<String> describeConstable() {
        return s.describeConstable();
    }

    public byte[] getBytes() {
        return s.getBytes();
    }

    public int indexOf(int ch) {
        return s.indexOf(ch);
    }

    public String stripLeading() {
        return s.stripLeading();
    }

    public int indexOf(String str, int beginIndex, int endIndex) {
        return s.indexOf(str, beginIndex, endIndex);
    }

    public int codePointCount(int beginIndex, int endIndex) {
        return s.codePointCount(beginIndex, endIndex);
    }

    public String indent(int n) {
        return s.indent(n);
    }

    public String[] splitWithDelimiters(String regex, int limit) {
        return s.splitWithDelimiters(regex, limit);
    }

    public CharSequence subSequence(int beginIndex, int endIndex) {
        return s.subSequence(beginIndex, endIndex);
    }

    public int indexOf(int ch, int beginIndex, int endIndex) {
        return s.indexOf(ch, beginIndex, endIndex);
    }

    public boolean isBlank() {
        return s.isBlank();
    }

    public int lastIndexOf(String str, int fromIndex) {
        return s.lastIndexOf(str, fromIndex);
    }

    public boolean matches(String regex) {
        return s.matches(regex);
    }

    public String stripIndent() {
        return s.stripIndent();
    }

    public int lastIndexOf(int ch) {
        return s.lastIndexOf(ch);
    }

    public String toLowerCase(Locale locale) {
        return s.toLowerCase(locale);
    }

    public String replaceFirst(String regex, String replacement) {
        return s.replaceFirst(regex, replacement);
    }

    public String[] split(String regex) {
        return s.split(regex);
    }

    @Deprecated(since = "1.1")
    public void getBytes(int srcBegin, int srcEnd, byte[] dst, int dstBegin) {
        s.getBytes(srcBegin, srcEnd, dst, dstBegin);
    }

    public boolean startsWith(String prefix, int toffset) {
        return s.startsWith(prefix, toffset);
    }

    public String trim() {
        return s.trim();
    }

    public boolean isEmpty() {
        return s.isEmpty();
    }

    public String toUpperCase(Locale locale) {
        return s.toUpperCase(locale);
    }

    public String translateEscapes() {
        return s.translateEscapes();
    }

    public int indexOf(String str) {
        return s.indexOf(str);
    }
}
