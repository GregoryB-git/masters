.class public abstract Lcom/google/protobuf/r;
.super Lcom/google/protobuf/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/protobuf/r$b;,
        Lcom/google/protobuf/r$a;,
        Lcom/google/protobuf/r$c;
    }
.end annotation


# static fields
.field private static final MEMOIZED_SERIALIZED_SIZE_MASK:I = 0x7fffffff

.field private static final MUTABLE_FLAG_MASK:I = -0x80000000

.field static final UNINITIALIZED_HASH_CODE:I = 0x0

.field static final UNINITIALIZED_SERIALIZED_SIZE:I = 0x7fffffff

.field private static defaultInstanceMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Lcom/google/protobuf/r;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private memoizedSerializedSize:I

.field protected unknownFields:Lcom/google/protobuf/h0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lcom/google/protobuf/r;->defaultInstanceMap:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/a;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/protobuf/r;->memoizedSerializedSize:I

    invoke-static {}, Lcom/google/protobuf/h0;->c()Lcom/google/protobuf/h0;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/r;->unknownFields:Lcom/google/protobuf/h0;

    return-void
.end method

.method public static A(Ljava/lang/Class;)Lcom/google/protobuf/r;
    .locals 3

    .line 1
    sget-object v0, Lcom/google/protobuf/r;->defaultInstanceMap:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/r;

    if-nez v0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v0, v2, v1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    sget-object v0, Lcom/google/protobuf/r;->defaultInstanceMap:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/r;

    goto :goto_0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Class initialization cannot fail."

    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    :goto_0
    if-nez v0, :cond_2

    invoke-static {p0}, Lcom/google/protobuf/k0;->k(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/r;

    invoke-virtual {v0}, Lcom/google/protobuf/r;->B()Lcom/google/protobuf/r;

    move-result-object v0

    if-eqz v0, :cond_1

    sget-object v1, Lcom/google/protobuf/r;->defaultInstanceMap:Ljava/util/Map;

    invoke-interface {v1, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    throw p0

    :cond_2
    :goto_1
    return-object v0
.end method

.method public static varargs F(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    :try_start_0
    invoke-virtual {p0, p1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    instance-of p1, p0, Ljava/lang/RuntimeException;

    if-nez p1, :cond_1

    instance-of p1, p0, Ljava/lang/Error;

    if-eqz p1, :cond_0

    check-cast p0, Ljava/lang/Error;

    throw p0

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Unexpected exception thrown by generated accessor method."

    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :cond_1
    check-cast p0, Ljava/lang/RuntimeException;

    throw p0

    :catch_1
    move-exception p0

    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Couldn\'t use Java reflection to implement protocol message reflection."

    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static final H(Lcom/google/protobuf/r;Z)Z
    .locals 2

    .line 1
    sget-object v0, Lcom/google/protobuf/r$c;->o:Lcom/google/protobuf/r$c;

    invoke-virtual {p0, v0}, Lcom/google/protobuf/r;->v(Lcom/google/protobuf/r$c;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Byte;

    invoke-virtual {v0}, Ljava/lang/Byte;->byteValue()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    if-nez v0, :cond_1

    const/4 p0, 0x0

    return p0

    :cond_1
    invoke-static {}, Lcom/google/protobuf/W;->a()Lcom/google/protobuf/W;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/protobuf/W;->d(Ljava/lang/Object;)Lcom/google/protobuf/Z;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/google/protobuf/Z;->c(Ljava/lang/Object;)Z

    move-result v0

    if-eqz p1, :cond_3

    sget-object p1, Lcom/google/protobuf/r$c;->p:Lcom/google/protobuf/r$c;

    if-eqz v0, :cond_2

    move-object v1, p0

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0, p1, v1}, Lcom/google/protobuf/r;->w(Lcom/google/protobuf/r$c;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return v0
.end method

.method public static L(Lcom/google/protobuf/t$d;)Lcom/google/protobuf/t$d;
    .locals 1

    .line 1
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/16 v0, 0xa

    goto :goto_0

    :cond_0
    mul-int/lit8 v0, v0, 0x2

    :goto_0
    invoke-interface {p0, v0}, Lcom/google/protobuf/t$d;->h(I)Lcom/google/protobuf/t$d;

    move-result-object p0

    return-object p0
.end method

.method public static M(Lcom/google/protobuf/t$e;)Lcom/google/protobuf/t$e;
    .locals 1

    .line 1
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/16 v0, 0xa

    goto :goto_0

    :cond_0
    mul-int/lit8 v0, v0, 0x2

    :goto_0
    invoke-interface {p0, v0}, Lcom/google/protobuf/t$e;->h(I)Lcom/google/protobuf/t$e;

    move-result-object p0

    return-object p0
.end method

.method public static O(Lcom/google/protobuf/K;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/protobuf/Y;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/protobuf/Y;-><init>(Lcom/google/protobuf/K;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v0
.end method

.method public static Q(Ljava/lang/Class;Lcom/google/protobuf/r;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/google/protobuf/r;->K()V

    sget-object v0, Lcom/google/protobuf/r;->defaultInstanceMap:Ljava/util/Map;

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static y()Lcom/google/protobuf/t$d;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/protobuf/s;->i()Lcom/google/protobuf/s;

    move-result-object v0

    return-object v0
.end method

.method public static z()Lcom/google/protobuf/t$e;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/protobuf/X;->f()Lcom/google/protobuf/X;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final B()Lcom/google/protobuf/r;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/r$c;->t:Lcom/google/protobuf/r$c;

    invoke-virtual {p0, v0}, Lcom/google/protobuf/r;->v(Lcom/google/protobuf/r$c;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/r;

    return-object v0
.end method

.method public C()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/a;->memoizedHashCode:I

    return v0
.end method

.method public D()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/protobuf/r;->memoizedSerializedSize:I

    const v1, 0x7fffffff

    and-int/2addr v0, v1

    return v0
.end method

.method public E()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/r;->C()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final G()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    invoke-static {p0, v0}, Lcom/google/protobuf/r;->H(Lcom/google/protobuf/r;Z)Z

    move-result v0

    return v0
.end method

.method public I()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/protobuf/r;->memoizedSerializedSize:I

    const/high16 v1, -0x80000000

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public J()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/protobuf/W;->a()Lcom/google/protobuf/W;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/protobuf/W;->d(Ljava/lang/Object;)Lcom/google/protobuf/Z;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/google/protobuf/Z;->b(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/protobuf/r;->K()V

    return-void
.end method

.method public K()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/protobuf/r;->memoizedSerializedSize:I

    const v1, 0x7fffffff

    and-int/2addr v0, v1

    iput v0, p0, Lcom/google/protobuf/r;->memoizedSerializedSize:I

    return-void
.end method

.method public final N()Lcom/google/protobuf/r$a;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/r$c;->s:Lcom/google/protobuf/r$c;

    invoke-virtual {p0, v0}, Lcom/google/protobuf/r;->v(Lcom/google/protobuf/r$c;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/r$a;

    return-object v0
.end method

.method public P()Lcom/google/protobuf/r;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/r$c;->r:Lcom/google/protobuf/r$c;

    invoke-virtual {p0, v0}, Lcom/google/protobuf/r;->v(Lcom/google/protobuf/r$c;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/r;

    return-object v0
.end method

.method public R(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/protobuf/a;->memoizedHashCode:I

    return-void
.end method

.method public S(I)V
    .locals 3

    .line 1
    if-ltz p1, :cond_0

    iget v0, p0, Lcom/google/protobuf/r;->memoizedSerializedSize:I

    const/high16 v1, -0x80000000

    and-int/2addr v0, v1

    const v1, 0x7fffffff

    and-int/2addr p1, v1

    or-int/2addr p1, v0

    iput p1, p0, Lcom/google/protobuf/r;->memoizedSerializedSize:I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "serialized size must be non-negative, was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public a()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/protobuf/r;->h(Lcom/google/protobuf/Z;)I

    move-result v0

    return v0
.end method

.method public bridge synthetic b()Lcom/google/protobuf/K;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/r;->B()Lcom/google/protobuf/r;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d()Lcom/google/protobuf/K$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/r;->N()Lcom/google/protobuf/r$a;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-nez p1, :cond_1

    return v0

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_2

    return v0

    :cond_2
    invoke-static {}, Lcom/google/protobuf/W;->a()Lcom/google/protobuf/W;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/protobuf/W;->d(Ljava/lang/Object;)Lcom/google/protobuf/Z;

    move-result-object v0

    check-cast p1, Lcom/google/protobuf/r;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Z;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public h(Lcom/google/protobuf/Z;)I
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/r;->I()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/google/protobuf/r;->t(Lcom/google/protobuf/Z;)I

    move-result p1

    if-ltz p1, :cond_0

    return p1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "serialized size must be non-negative, was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-virtual {p0}, Lcom/google/protobuf/r;->D()I

    move-result v0

    const v1, 0x7fffffff

    if-eq v0, v1, :cond_2

    invoke-virtual {p0}, Lcom/google/protobuf/r;->D()I

    move-result p1

    return p1

    :cond_2
    invoke-virtual {p0, p1}, Lcom/google/protobuf/r;->t(Lcom/google/protobuf/Z;)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/protobuf/r;->S(I)V

    return p1
.end method

.method public hashCode()I
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/r;->I()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/protobuf/r;->s()I

    move-result v0

    return v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/r;->E()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/google/protobuf/r;->s()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/protobuf/r;->R(I)V

    :cond_1
    invoke-virtual {p0}, Lcom/google/protobuf/r;->C()I

    move-result v0

    return v0
.end method

.method public j(Lcom/google/protobuf/h;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/protobuf/W;->a()Lcom/google/protobuf/W;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/protobuf/W;->d(Ljava/lang/Object;)Lcom/google/protobuf/Z;

    move-result-object v0

    invoke-static {p1}, Lcom/google/protobuf/i;->P(Lcom/google/protobuf/h;)Lcom/google/protobuf/i;

    move-result-object p1

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Z;->h(Ljava/lang/Object;Lcom/google/protobuf/n0;)V

    return-void
.end method

.method public m()Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/r$c;->q:Lcom/google/protobuf/r$c;

    invoke-virtual {p0, v0}, Lcom/google/protobuf/r;->v(Lcom/google/protobuf/r$c;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public q()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/protobuf/a;->memoizedHashCode:I

    return-void
.end method

.method public r()V
    .locals 1

    .line 1
    const v0, 0x7fffffff

    invoke-virtual {p0, v0}, Lcom/google/protobuf/r;->S(I)V

    return-void
.end method

.method public s()I
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/protobuf/W;->a()Lcom/google/protobuf/W;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/protobuf/W;->d(Ljava/lang/Object;)Lcom/google/protobuf/Z;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/google/protobuf/Z;->g(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final t(Lcom/google/protobuf/Z;)I
    .locals 0

    .line 1
    if-nez p1, :cond_0

    invoke-static {}, Lcom/google/protobuf/W;->a()Lcom/google/protobuf/W;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/google/protobuf/W;->d(Ljava/lang/Object;)Lcom/google/protobuf/Z;

    move-result-object p1

    invoke-interface {p1, p0}, Lcom/google/protobuf/Z;->e(Ljava/lang/Object;)I

    move-result p1

    return p1

    :cond_0
    invoke-interface {p1, p0}, Lcom/google/protobuf/Z;->e(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/google/protobuf/M;->f(Lcom/google/protobuf/K;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u()Lcom/google/protobuf/r$a;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/r$c;->s:Lcom/google/protobuf/r$c;

    invoke-virtual {p0, v0}, Lcom/google/protobuf/r;->v(Lcom/google/protobuf/r$c;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/r$a;

    return-object v0
.end method

.method public v(Lcom/google/protobuf/r$c;)Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, v0}, Lcom/google/protobuf/r;->x(Lcom/google/protobuf/r$c;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public w(Lcom/google/protobuf/r$c;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/google/protobuf/r;->x(Lcom/google/protobuf/r$c;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public abstract x(Lcom/google/protobuf/r$c;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
.end method
