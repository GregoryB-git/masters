.class public final Lcom/google/crypto/tink/shaded/protobuf/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lcom/google/crypto/tink/shaded/protobuf/a0;


# instance fields
.field public final a:Lcom/google/crypto/tink/shaded/protobuf/f0;

.field public final b:Ljava/util/concurrent/ConcurrentMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/a0;

    invoke-direct {v0}, Lcom/google/crypto/tink/shaded/protobuf/a0;-><init>()V

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/a0;->c:Lcom/google/crypto/tink/shaded/protobuf/a0;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/a0;->b:Ljava/util/concurrent/ConcurrentMap;

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/G;

    invoke-direct {v0}, Lcom/google/crypto/tink/shaded/protobuf/G;-><init>()V

    iput-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/a0;->a:Lcom/google/crypto/tink/shaded/protobuf/f0;

    return-void
.end method

.method public static a()Lcom/google/crypto/tink/shaded/protobuf/a0;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/a0;->c:Lcom/google/crypto/tink/shaded/protobuf/a0;

    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/e0;)Lcom/google/crypto/tink/shaded/protobuf/e0;
    .locals 1

    .line 1
    const-string v0, "messageType"

    invoke-static {p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "schema"

    invoke-static {p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/a0;->b:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1, p2}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/e0;

    return-object p1
.end method

.method public c(Ljava/lang/Class;)Lcom/google/crypto/tink/shaded/protobuf/e0;
    .locals 1

    .line 1
    const-string v0, "messageType"

    invoke-static {p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/a0;->b:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/e0;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/a0;->a:Lcom/google/crypto/tink/shaded/protobuf/f0;

    invoke-interface {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/f0;->a(Ljava/lang/Class;)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/a0;->b(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/e0;)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object p1

    if-eqz p1, :cond_0

    move-object v0, p1

    :cond_0
    return-object v0
.end method

.method public d(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/e0;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a0;->c(Ljava/lang/Class;)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object p1

    return-object p1
.end method
