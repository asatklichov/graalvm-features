package measures.in.graalvm;

/**
 * https://developers.redhat.com/articles/2021/06/23/how-jit-compiler-boosts-java-performance-openjdk#the_jit_compiler_in_openjdk
 * https://www.eclipse.org/openj9/docs/jit/
 */
public class JITDemo {
	//put whole param in JVM config:   -XX:+PrintCompilation
	//-XX:+PrintCompilation
	//if you use GraalVM then disable Grall: -XX:-UseJVMCICompiler -XX:+PrintCompilation
	public static void main(String[] args) {
		System.out.println("Hi JIT");
	}
	/**
	 * <pre>
     81    1       3       java.lang.Object::<init> (1 bytes)
     81    3       3       java.lang.StringLatin1::hashCode (42 bytes)
     81    6       3       java.util.ImmutableCollections$SetN::probe (56 bytes)
     82    2       3       java.lang.String::hashCode (60 bytes)
     82    8       3       java.util.ImmutableCollections$SetN::hashCode (46 bytes)
     83    9       3       java.lang.StringLatin1::equals (36 bytes)
     83    5       3       java.lang.Math::floorMod (20 bytes)
     83    4       3       java.lang.String::isLatin1 (19 bytes)
     83    7       3       java.lang.String::equals (56 bytes)
     83   11       3       java.util.Objects::equals (23 bytes)
     84   10       3       java.lang.module.ModuleDescriptor$Exports::<init> (20 bytes)
     84   12       3       java.lang.module.ModuleDescriptor$Exports::hashCode (38 bytes)
     84   13       3       java.util.Set::of (4 bytes)
     84   16       3       java.util.Objects::requireNonNull (14 bytes)
     84   14       3       jdk.internal.module.Builder::newExports (12 bytes)
     85   15       3       java.lang.module.ModuleDescriptor$1::newExports (12 bytes)
     85   17       3       java.util.Objects::hashCode (13 bytes)
     85   18       3       java.util.ImmutableCollections$ListN::get (7 bytes)
     85   20       3       java.util.AbstractCollection::<init> (5 bytes)
     85   21       3       java.util.ImmutableCollections$AbstractImmutableCollection::<init> (5 bytes)
     85   19       3       java.lang.module.ModuleDescriptor$Exports::equals (60 bytes)
     86   23       3       java.util.ImmutableCollections$SetN::<init> (90 bytes)
     87   25       3       java.lang.String::coder (15 bytes)
     87   22       3       java.util.ImmutableCollections$AbstractImmutableSet::<init> (5 bytes)
     87   27       3       java.lang.String::length (11 bytes)
     87   24       3       java.util.Set::of (68 bytes)
     88   26       1       java.lang.module.ModuleDescriptor::name (5 bytes)
     88   29       1       java.lang.module.ModuleReference::descriptor (5 bytes)
     88   32       3       java.net.URI::hash (33 bytes)
     88   30       3       java.lang.String::charAt (25 bytes)
     89   31       3       java.lang.StringLatin1::charAt (28 bytes)
     89   28       3       java.lang.String::isEmpty (14 bytes)
    165   33       3       java.util.concurrent.ConcurrentHashMap::tabAt (22 bytes)
    165   35     n 0       jdk.internal.misc.Unsafe::getReferenceVolatile (native)   
    165   34       3       jdk.internal.misc.Unsafe::getReferenceAcquire (7 bytes)
    165   37       3       java.util.ImmutableCollections$SetN$SetNIterator::next (90 bytes)
    165   36       3       java.util.concurrent.ConcurrentHashMap::spread (10 bytes)
    168   38     n 0       java.lang.invoke.MethodHandle::linkToStatic(LLLLLLL)L (native)   (static)
    168   39     n 0       java.lang.Object::hashCode (native)   
    169   40       1       java.lang.Enum::ordinal (5 bytes)
    169   41     n 0       java.lang.invoke.MethodHandle::linkToStatic(LL)I (native)   (static)
    169   42     n 0       java.lang.System::arraycopy (native)   (static)
    170   43     n 0       java.lang.invoke.MethodHandle::invokeBasic(LLLLLL)L (native)   
    170   45     n 0       jdk.internal.misc.Unsafe::compareAndSetLong (native)   
    170   44       3       java.util.concurrent.ConcurrentHashMap::addCount (280 bytes)
    170   46     n 0       java.lang.invoke.MethodHandle::linkToSpecial(LLLLLLLL)L (native)   (static)
    171   47   !   3       java.util.concurrent.ConcurrentHashMap::putVal (432 bytes)
    171   49     n 0       java.lang.Class::isPrimitive (native)   
    172   50     n 0       jdk.internal.misc.Unsafe::compareAndSetReference (native)   
    172   52     n 0       java.lang.invoke.MethodHandle::linkToStatic(LLL)L (native)   (static)
    173   53     n 0       java.lang.invoke.MethodHandle::linkToStatic(LLLL)L (native)   (static)
    173   48       3       java.util.concurrent.ConcurrentHashMap$Node::<init> (20 bytes)
    173   51       1       java.lang.Class::getClassLoader0 (5 bytes)
    176   55     n 0       java.lang.invoke.MethodHandle::invokeBasic()L (native)   
    176   54       1       java.lang.invoke.MethodType::returnType (5 bytes)
    176   56     n 0       java.lang.invoke.MethodHandle::linkToSpecial(LL)L (native)   (static)
    177   57     n 0       java.lang.invoke.MethodHandle::linkToStatic(LLL)I (native)   (static)
    177   58       3       java.lang.invoke.MethodTypeForm::canonicalize (74 bytes)
    177   60     n 0       java.lang.invoke.MethodHandle::linkToSpecial(LLL)V (native)   (static)
    177   61     n 0       java.lang.invoke.MethodHandle::invokeBasic(L)L (native)   
    177   59       3       java.lang.invoke.MemberName::testFlags (16 bytes)
    177   62     n 0       java.lang.invoke.MethodHandle::linkToSpecial(LLL)L (native)   (static)
    178   63     n 0       java.lang.invoke.MethodHandle::linkToVirtual(LL)L (native)   (static)
    178   65       3       java.lang.StringLatin1::indexOfChar (33 bytes)
    178   64   !   3       java.lang.ref.ReferenceQueue::poll (28 bytes)
    179   66       3       java.lang.invoke.MethodType::hashCode (53 bytes)
    179   69     n 0       java.lang.invoke.MethodHandle::linkToSpecial(LL)V (native)   (static)
    179   68       3       java.lang.invoke.MethodType$ConcurrentWeakInternSet::expungeStaleElements (27 bytes)
    179   75     n 0       java.lang.invoke.MethodHandle::linkToInterface(LLL)I (native)   (static)
    179   71       3       java.util.concurrent.ConcurrentHashMap::get (162 bytes)
    180   76     n 0       java.lang.invoke.MethodHandle::linkToStatic(LL)L (native)   (static)
    180   73       3       java.lang.invoke.MemberName::isInvocable (8 bytes)
    180   74       3       java.lang.invoke.MemberName::testAnyFlags (15 bytes)
    180   70       3       java.lang.StringLatin1::canEncode (13 bytes)
    181   67       1       java.lang.invoke.MemberName::getDeclaringClass (5 bytes)
    181   72       3       java.util.concurrent.ConcurrentHashMap::putIfAbsent (8 bytes)
    181   77       3       java.lang.Math::min (11 bytes)
    181   78     n 0       java.lang.Class::isArray (native)   
    181   79     n 0       java.lang.invoke.MethodHandle::linkToSpecial(LL)I (native)   (static)
    182   80       1       java.lang.invoke.MethodType::form (5 bytes)
    182   81       3       java.lang.invoke.MethodType::makeImpl (109 bytes)
    183   84       3       java.util.ImmutableCollections$SetN$SetNIterator::hasNext (13 bytes)
    183   85       1       java.util.stream.FindOps$FindSink::cancellationRequested (5 bytes)
    183   86       3       java.util.HashMap::hash (20 bytes)
    184   87       3       java.util.stream.ReferencePipeline$2$1::accept (27 bytes)
    184   89       3       java.util.stream.Sink$ChainedReference::cancellationRequested (10 bytes)
    184   95       3       java.util.HashMap::putVal (300 bytes)
    184   90       3       java.util.Spliterators$IteratorSpliterator::tryAdvance (77 bytes)
    184  100       3       java.util.ImmutableCollections$MapN::probe (60 bytes)
    184   91       3       jdk.internal.module.DefaultRoots$$Lambda$9/0x80000000a::test (8 bytes)
    185   92       3       jdk.internal.module.DefaultRoots::lambda$exportsAPI$2 (13 bytes)
    185   93       3       java.lang.module.ModuleDescriptor$Exports::isQualified (18 bytes)
    185   94       3       java.util.ImmutableCollections$SetN::isEmpty (13 bytes)
    185  103       3       java.util.HashMap::getNode (150 bytes)
    185   96       3       java.util.HashMap::newNode (13 bytes)
    185   97       3       java.util.HashMap$Node::<init> (26 bytes)
    185   98       3       java.util.HashMap::afterNodeInsertion (1 bytes)
    185   99       3       java.util.HashMap::put (13 bytes)
  95       3       java.util.HashMap::putVal (300 bytes)   made not entrant
    186  110       3       java.util.HashMap$HashIterator::nextNode (100 bytes)
    186  106       3       java.util.HashMap$HashIterator::hasNext (13 bytes)
    186  113       3       java.util.HashMap::putVal (300 bytes)
    186  107       3       java.util.HashMap::get (19 bytes)
    186  101       3       java.util.ImmutableCollections$MapN::get (35 bytes)
    186  102       3       java.util.Optional::<init> (10 bytes)
    186  109       1       java.lang.module.ModuleDescriptor$Requires::name (5 bytes)
    187  105       3       java.util.HashSet::add (20 bytes)
    187  108       1       java.lang.module.ModuleDescriptor$Requires::modifiers (5 bytes)
    187  112       3       java.lang.module.ModuleDescriptor::hashCode (170 bytes)
    187  111       3       java.util.HashMap::containsKey (14 bytes)
    187  115       3       java.util.ImmutableCollections$Set12$1::hasNext (13 bytes)
    187  114       1       java.lang.module.ModuleDescriptor::requires (5 bytes)
    187  104       1       jdk.internal.module.ModuleReferenceImpl::moduleResolution (5 bytes)
    187   88       1       java.util.Spliterators$IteratorSpliterator::characteristics (5 bytes)
    187  125       3       java.util.HashMap$KeyIterator::next (8 bytes)
    188  116       3       jdk.internal.module.ModuleReferenceImpl::hashCode (56 bytes)
    188  126       3       java.util.HashMap$HashIterator::<init> (79 bytes)
    188  121       3       java.lang.module.ResolvedModule::hashCode (16 bytes)
    188  127       3       java.util.HashMap::keySet (25 bytes)
    188  128       3       java.util.HashMap$KeySet::iterator (12 bytes)
    188  129       3       java.util.HashMap$KeyIterator::<init> (11 bytes)
    188  130       3       java.util.HashSet::iterator (13 bytes)
    188  119       3       java.util.AbstractSet::<init> (5 bytes)
    188  124       3       java.util.HashSet::contains (9 bytes)
    189  117       3       java.util.ImmutableCollections$SetN::contains (26 bytes)
    189  123       3       java.util.AbstractMap::<init> (5 bytes)
    189  118       3       java.util.ImmutableCollections$Set12$1::next (95 bytes)
    189  134       1       java.lang.module.ModuleDescriptor$Exports::source (5 bytes)
    189  137       3       java.util.HashMap::resize (356 bytes)
    189  136       3       java.util.HashMap::putIfAbsent (13 bytes)
    189  133       1       java.lang.module.ModuleDescriptor$Exports::targets (5 bytes)
    189  132       1       java.util.ImmutableCollections$Set12::isEmpty (2 bytes)
    189  122       3       java.lang.Object::equals (11 bytes)
    189  135       3       java.util.ImmutableCollections$Set12::contains (28 bytes)
    189  131       3       java.util.HashMap$ValueIterator::next (8 bytes)
    189  120       1       java.lang.module.ModuleDescriptor::isAutomatic (5 bytes)
    190   82       3       java.lang.invoke.MethodType::<init> (15 bytes)
    190   83       3       java.lang.invoke.MethodType$ConcurrentWeakInternSet::get (47 bytes)
    190  140       3       java.util.HashMap::<init> (11 bytes)
    190  138       1       java.lang.module.ModuleDescriptor::provides (5 bytes)
    190  141       1       java.lang.module.ModuleDescriptor::exports (5 bytes)
    190  142       3       java.util.ImmutableCollections$Set12::iterator (9 bytes)
    190  143       3       java.util.ImmutableCollections$Set12$1::<init> (32 bytes)
    190  139       1       java.lang.module.ModuleDescriptor$Provides::service (5 bytes)
    191  144       3       java.util.ImmutableCollections$SetN::iterator (9 bytes)
    191  145       3       java.util.ImmutableCollections$SetN$SetNIterator::<init> (36 bytes)
    191  147       3       java.util.HashSet::<init> (16 bytes)
    191  146       1       java.lang.module.ModuleDescriptor::uses (5 bytes)
    191  148       3       java.lang.StringLatin1::lastIndexOf (125 bytes)
    191  149       3       java.lang.String::<init> (15 bytes)
    192  150       3       java.util.Arrays::copyOfRange (64 bytes)
    192  151       3       java.lang.StringLatin1::newString (24 bytes)
    193  152       1       java.util.HashMap$Node::getKey (5 bytes)
    193  154       3       java.lang.String::checkBoundsBeginEnd (63 bytes)
    194  153       3       java.lang.String::substring (58 bytes)
    194  155       1       java.util.HashMap$Node::getValue (5 bytes)
    194  156       3       java.lang.module.ResolvedModule::descriptor (8 bytes)
    194  157       1       java.util.KeyValueHolder::getKey (5 bytes)
    194  158       1       java.util.KeyValueHolder::getValue (5 bytes)
    195  159       3       java.util.concurrent.ConcurrentHashMap::casTabAt (21 bytes)
    195  160       3       java.util.Optional::orElse (16 bytes)
    195  161       1       java.lang.module.ModuleDescriptor::packages (5 bytes)
    195  162       3       java.lang.module.ResolvedModule::name (11 bytes)
    195  163       3       java.util.Optional::ofNullable (19 bytes)
    196  164       3       java.lang.AbstractStringBuilder::ensureCapacityInternal (39 bytes)
    196  165       1       java.lang.module.ModuleDescriptor$Version::toString (5 bytes)
    196  166       3       java.lang.AbstractStringBuilder::isLatin1 (19 bytes)
    197  167       1       java.lang.module.ResolvedModule::reference (5 bytes)
    197  168       3       java.lang.AbstractStringBuilder::putStringAt (12 bytes)
    197  173       3       java.lang.AbstractStringBuilder::append (45 bytes)
    197  172       3       java.lang.StringBuilder::append (8 bytes)
    197  169       3       java.lang.AbstractStringBuilder::putStringAt (34 bytes)
    197  170       3       java.lang.AbstractStringBuilder::getCoder (15 bytes)
    198  171       3       java.lang.String::getBytes (46 bytes)
    199  174     n 0       java.lang.Module::addExports0 (native)   (static)
    199  175       3       java.util.HashMap::isEmpty (13 bytes)
    199  176       1       java.lang.module.ResolvedModule::configuration (5 bytes)
    199  177       1       java.lang.module.ModuleDescriptor::isOpen (5 bytes)
    199  178       3       java.util.HashSet::isEmpty (8 bytes)
    200  179       1       java.util.HashMap::size (5 bytes)
    200  180       3       jdk.internal.module.ServicesCatalog$ServiceProvider::<init> (15 bytes)
    203  181       3       java.lang.StringUTF16::getChar (60 bytes)
Hi JIT

	    Hi JIT
	 * </pre>
	 * 
	 * 
	 * with disabling Graal 
	<pre>
	     77    1       3       java.lang.Object::<init> (1 bytes)
     78    3       3       java.lang.StringLatin1::hashCode (42 bytes)
     78    6       3       java.util.ImmutableCollections$SetN::probe (56 bytes)
     78    2       3       java.lang.String::hashCode (60 bytes)
     79    8       3       java.util.ImmutableCollections$SetN::hashCode (46 bytes)
     79    9       3       java.lang.StringLatin1::equals (36 bytes)
     79    5       3       java.lang.Math::floorMod (20 bytes)
     79    4       3       java.lang.String::isLatin1 (19 bytes)
     80    7       3       java.lang.String::equals (56 bytes)
     80   10       3       java.lang.module.ModuleDescriptor$Exports::<init> (20 bytes)
     80   11       3       java.util.Objects::equals (23 bytes)
     81   12       3       java.lang.module.ModuleDescriptor$Exports::hashCode (38 bytes)
     81   14       3       jdk.internal.module.Builder::newExports (12 bytes)
     81   17       4       java.lang.StringLatin1::hashCode (42 bytes)
     81   16       3       java.util.Objects::requireNonNull (14 bytes)
     82   13       3       java.util.Set::of (4 bytes)
     82   18       3       java.util.Objects::hashCode (13 bytes)
     82   15       3       java.lang.module.ModuleDescriptor$1::newExports (12 bytes)
     82   19       3       java.util.ImmutableCollections$ListN::get (7 bytes)
     82   23       3       java.util.AbstractCollection::<init> (5 bytes)
     82   22       3       java.util.ImmutableCollections$AbstractImmutableSet::<init> (5 bytes)
     83   24       3       java.util.ImmutableCollections$AbstractImmutableCollection::<init> (5 bytes)
     83   25       3       java.util.Set::of (68 bytes)
     83   20       3       java.lang.module.ModuleDescriptor$Exports::equals (60 bytes)
     84   26       3       java.lang.String::coder (15 bytes)
     84   28       3       java.lang.String::length (11 bytes)
     84   27       1       java.lang.module.ModuleDescriptor::name (5 bytes)
     84   31       3       java.lang.String::charAt (25 bytes)
     84   30       1       java.lang.module.ModuleReference::descriptor (5 bytes)
     85   29       3       java.lang.String::isEmpty (14 bytes)
   3       3       java.lang.StringLatin1::hashCode (42 bytes)   made not entrant
     85   21       4       java.lang.Object::<init> (1 bytes)
   1       3       java.lang.Object::<init> (1 bytes)   made not entrant
    158   34     n 0       jdk.internal.misc.Unsafe::getReferenceVolatile (native)   
    158   32       3       java.util.concurrent.ConcurrentHashMap::tabAt (22 bytes)
    159   36       3       java.util.ImmutableCollections$SetN$SetNIterator::next (90 bytes)
    159   33       3       jdk.internal.misc.Unsafe::getReferenceAcquire (7 bytes)
    159   35       3       java.util.concurrent.ConcurrentHashMap::spread (10 bytes)
    161   37     n 0       java.lang.invoke.MethodHandle::linkToStatic(LLLLLLL)L (native)   (static)
    162   38     n 0       java.lang.Object::hashCode (native)   
    162   39       1       java.lang.Enum::ordinal (5 bytes)
    163   40     n 0       java.lang.invoke.MethodHandle::linkToStatic(LL)I (native)   (static)
    163   41     n 0       java.lang.System::arraycopy (native)   (static)
    163   42     n 0       java.lang.invoke.MethodHandle::invokeBasic(LLLLLL)L (native)   
    163   44     n 0       jdk.internal.misc.Unsafe::compareAndSetLong (native)   
    164   43       3       java.util.concurrent.ConcurrentHashMap::addCount (280 bytes)
    164   45     n 0       java.lang.invoke.MethodHandle::linkToSpecial(LLLLLLLL)L (native)   (static)
    165   46   !   3       java.util.concurrent.ConcurrentHashMap::putVal (432 bytes)
    165   48     n 0       java.lang.Class::isPrimitive (native)   
    165   49     n 0       jdk.internal.misc.Unsafe::compareAndSetReference (native)   
    166   51     n 0       java.lang.invoke.MethodHandle::linkToStatic(LLL)L (native)   (static)
    166   52     n 0       java.lang.invoke.MethodHandle::linkToStatic(LLLL)L (native)   (static)
    167   50       1       java.lang.Class::getClassLoader0 (5 bytes)
    167   47       3       java.util.concurrent.ConcurrentHashMap$Node::<init> (20 bytes)
    169   53       1       java.lang.invoke.MethodType::returnType (5 bytes)
    169   54     n 0       java.lang.invoke.MethodHandle::invokeBasic()L (native)   
    170   55     n 0       java.lang.invoke.MethodHandle::linkToSpecial(LL)L (native)   (static)
    170   56     n 0       java.lang.invoke.MethodHandle::linkToStatic(LLL)I (native)   (static)
    170   57       3       java.lang.invoke.MethodTypeForm::canonicalize (74 bytes)
    171   59     n 0       java.lang.invoke.MethodHandle::linkToSpecial(LLL)V (native)   (static)
    171   60     n 0       java.lang.invoke.MethodHandle::invokeBasic(L)L (native)   
    171   58       3       java.lang.invoke.MemberName::testFlags (16 bytes)
    171   61     n 0       java.lang.invoke.MethodHandle::linkToSpecial(LLL)L (native)   (static)
    171   62     n 0       java.lang.invoke.MethodHandle::linkToVirtual(LL)L (native)   (static)
    171   64       3       java.lang.StringLatin1::indexOfChar (33 bytes)
    172   63   !   3       java.lang.ref.ReferenceQueue::poll (28 bytes)
    172   65       3       java.lang.invoke.MethodType::hashCode (53 bytes)
    172   68     n 0       java.lang.invoke.MethodHandle::linkToSpecial(LL)V (native)   (static)
    172   67       3       java.lang.invoke.MethodType$ConcurrentWeakInternSet::expungeStaleElements (27 bytes)
    172   74     n 0       java.lang.invoke.MethodHandle::linkToInterface(LLL)I (native)   (static)
    173   70       3       java.util.concurrent.ConcurrentHashMap::get (162 bytes)
    173   75     n 0       java.lang.invoke.MethodHandle::linkToStatic(LL)L (native)   (static)
    173   72       3       java.lang.invoke.MemberName::isInvocable (8 bytes)
    174   73       3       java.lang.invoke.MemberName::testAnyFlags (15 bytes)
    174   69       3       java.lang.StringLatin1::canEncode (13 bytes)
    174   66       1       java.lang.invoke.MemberName::getDeclaringClass (5 bytes)
    174   76       3       java.lang.Math::min (11 bytes)
    174   77     n 0       java.lang.Class::isArray (native)   
    174   71       3       java.util.concurrent.ConcurrentHashMap::putIfAbsent (8 bytes)
    174   78     n 0       java.lang.invoke.MethodHandle::linkToSpecial(LL)I (native)   (static)
    175   79       1       java.lang.invoke.MethodType::form (5 bytes)
    175   80       3       java.lang.invoke.MethodType::makeImpl (109 bytes)
    176   81       3       java.lang.invoke.MethodType::<init> (15 bytes)
    176   84       3       java.util.ImmutableCollections$SetN$SetNIterator::hasNext (13 bytes)
    176   86       3       java.util.stream.ReferencePipeline$2$1::accept (27 bytes)
    176   85       1       java.util.stream.FindOps$FindSink::cancellationRequested (5 bytes)
    176   87       3       java.util.stream.Sink$ChainedReference::cancellationRequested (10 bytes)
    177   89       3       jdk.internal.module.DefaultRoots$$Lambda$9/0x80000000a::test (8 bytes)
    177   90       4       java.lang.String::hashCode (60 bytes)
    177   91       3       java.util.HashMap::putVal (300 bytes)
  91       3       java.util.HashMap::putVal (300 bytes)   made not entrant
    178   94       3       java.util.ImmutableCollections$MapN::probe (60 bytes)
    178  104       3       java.util.HashMap$HashIterator::nextNode (100 bytes)
    178   98       3       java.util.HashMap::getNode (150 bytes)
    179  108       3       java.util.HashMap::putVal (300 bytes)
    179   83       3       java.util.HashMap::hash (20 bytes)
    179   97       3       java.util.HashMap::afterNodeInsertion (1 bytes)
    179   93       3       java.util.HashMap$Node::<init> (26 bytes)
    179   96       3       java.util.HashMap::put (13 bytes)
    179  101       3       java.util.HashMap$HashIterator::hasNext (13 bytes)
    179  107       3       java.lang.module.ModuleDescriptor::hashCode (170 bytes)
    180  105       3       java.util.HashMap::get (19 bytes)
    180  100       1       java.lang.module.ModuleDescriptor$Requires::name (5 bytes)
    180   92       3       java.util.HashMap::newNode (13 bytes)
    181  112       3       jdk.internal.module.ModuleReferenceImpl::hashCode (56 bytes)
    181  117       3       java.util.HashMap$HashIterator::<init> (79 bytes)
    181  106       3       java.util.HashSet::add (20 bytes)
    182  123       3       java.lang.module.ModuleDescriptor$Exports::isQualified (18 bytes)
    182  115       3       java.util.HashMap$KeyIterator::next (8 bytes)
    182  114       3       java.lang.module.ResolvedModule::hashCode (16 bytes)
    182  118       3       java.util.HashMap::keySet (25 bytes)
    182  119       3       java.util.HashMap$KeySet::iterator (12 bytes)
    182  120       3       java.util.HashMap$KeyIterator::<init> (11 bytes)
    182  121       3       java.util.HashSet::iterator (13 bytes)
    183  124       1       java.lang.module.ModuleDescriptor$Exports::targets (5 bytes)
    183  125       1       java.lang.module.ModuleDescriptor$Exports::source (5 bytes)
    183  134       3       java.util.HashMap::resize (356 bytes)
    184  130       3       java.util.HashMap::putIfAbsent (13 bytes)
    184  129       3       java.util.ImmutableCollections$Set12::contains (28 bytes)
    184  122       1       java.util.ImmutableCollections$Set12::isEmpty (2 bytes)
    185  127       3       java.lang.Object::equals (11 bytes)
    185  132       3       java.util.ImmutableCollections$SetN::contains (26 bytes)
    185   99       1       java.lang.module.ModuleDescriptor$Requires::modifiers (5 bytes)
    186  109       3       java.util.HashMap::containsKey (14 bytes)
    186  111       3       java.util.ImmutableCollections$Set12$1::hasNext (13 bytes)
   2       3       java.lang.String::hashCode (60 bytes)   made not entrant
    186  110       1       java.lang.module.ModuleDescriptor::requires (5 bytes)
    186  113       1       java.lang.module.ModuleDescriptor::isAutomatic (5 bytes)
    187  141       3       java.lang.StringLatin1::lastIndexOf (125 bytes)
    187  137       4       java.util.ImmutableCollections$SetN$SetNIterator::next (90 bytes)
    187  102       2       java.util.ImmutableCollections$SetN::isEmpty (13 bytes)
    187   95       1       jdk.internal.module.ModuleReferenceImpl::moduleResolution (5 bytes)
    187  144       4       java.util.HashMap::putVal (300 bytes)
    188  138       3       java.lang.String::<init> (15 bytes)
    188  139       3       java.util.ImmutableCollections$Set12$1::next (95 bytes)
    188  142       3       java.util.AbstractMap::<init> (5 bytes)
    188  148       4       java.lang.StringLatin1::equals (36 bytes)
    188  133       1       java.lang.module.ModuleDescriptor::exports (5 bytes)
    188  116       3       java.util.AbstractSet::<init> (5 bytes)
    188  146       3       java.util.ImmutableCollections$SetN::iterator (9 bytes)
    188  147       3       java.util.ImmutableCollections$SetN$SetNIterator::<init> (36 bytes)
    189   88       1       java.util.Spliterators$IteratorSpliterator::characteristics (5 bytes)
    189  131       1       java.lang.module.ModuleDescriptor$Provides::service (5 bytes)
    189  128       1       java.lang.module.ModuleDescriptor::provides (5 bytes)
    189  103       3       java.util.ImmutableCollections$MapN::get (35 bytes)
    189  135       1       java.lang.module.ModuleDescriptor::uses (5 bytes)
    189  153       3       java.util.concurrent.ConcurrentHashMap::casTabAt (21 bytes)
    189  149       1       java.util.HashMap$Node::getKey (5 bytes)
    189  155       3       java.util.Optional::<init> (10 bytes)
    190  154       3       java.util.Optional::orElse (16 bytes)
    190  151       1       java.util.KeyValueHolder::getKey (5 bytes)
    190  152       1       java.util.KeyValueHolder::getValue (5 bytes)
    190  156       1       java.lang.module.ModuleDescriptor::packages (5 bytes)
    190  157       3       java.util.Optional::ofNullable (19 bytes)
    190   82       3       java.lang.invoke.MethodType$ConcurrentWeakInternSet::get (47 bytes)
    190  150       1       java.util.HashMap$Node::getValue (5 bytes)
    190  158       3       java.lang.AbstractStringBuilder::ensureCapacityInternal (39 bytes)
    191  159       1       java.lang.module.ModuleDescriptor$Version::toString (5 bytes)
  36       3       java.util.ImmutableCollections$SetN$SetNIterator::next (90 bytes)   made not entrant
    191  160       3       java.lang.StringLatin1::newString (24 bytes)
    191  161       3       java.util.Arrays::copyOfRange (64 bytes)
    191  136       4       java.util.ImmutableCollections$SetN$SetNIterator::hasNext (13 bytes)
    191  162       3       java.lang.AbstractStringBuilder::isLatin1 (19 bytes)
    192  163       1       java.lang.module.ResolvedModule::reference (5 bytes)
    192  164       3       java.lang.AbstractStringBuilder::putStringAt (12 bytes)
    192  165       3       java.lang.AbstractStringBuilder::putStringAt (34 bytes)
    192  167       3       java.lang.String::getBytes (46 bytes)
  84       3       java.util.ImmutableCollections$SetN$SetNIterator::hasNext (13 bytes)   made not entrant
    192  166       3       java.lang.AbstractStringBuilder::getCoder (15 bytes)
    192  140       4       java.lang.module.ModuleDescriptor$Exports::isQualified (18 bytes)
    192  168       3       java.util.HashMap::<init> (11 bytes)
    192  169       3       java.util.ImmutableCollections$Set12::iterator (9 bytes)
    193  170       3       java.util.ImmutableCollections$Set12$1::<init> (32 bytes)
    193  171       3       java.util.HashSet::<init> (16 bytes)
 123       3       java.lang.module.ModuleDescriptor$Exports::isQualified (18 bytes)   made not entrant
    194  143       4       java.lang.String::equals (56 bytes)
    194  172     n 0       java.lang.Module::addExports0 (native)   (static)
    194  173       3       java.lang.module.ResolvedModule::name (11 bytes)
    194  174       3       java.util.HashMap::isEmpty (13 bytes)
    194  175       3       java.util.HashSet::isEmpty (8 bytes)
    195  176       1       java.lang.module.ModuleDescriptor::isOpen (5 bytes)
    195  177       1       java.lang.module.ResolvedModule::configuration (5 bytes)
   9       3       java.lang.StringLatin1::equals (36 bytes)   made not entrant
    195  178       1       java.util.HashMap::size (5 bytes)
    195  126       4       java.util.HashMap::afterNodeInsertion (1 bytes)
  97       3       java.util.HashMap::afterNodeInsertion (1 bytes)   made not entrant
    195  145       4       java.util.HashMap::newNode (13 bytes)
   7       3       java.lang.String::equals (56 bytes)   made not entrant
    196  179       3       jdk.internal.module.ServicesCatalog$ServiceProvider::<init> (15 bytes)
  92       3       java.util.HashMap::newNode (13 bytes)   made not entrant
    198  180       3       java.lang.StringUTF16::getChar (60 bytes)
 108       3       java.util.HashMap::putVal (300 bytes)   made not entrant
Hi JIT

	</pre>
	 */
}
