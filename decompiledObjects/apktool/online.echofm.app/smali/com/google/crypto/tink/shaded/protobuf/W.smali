.class public abstract Lcom/google/crypto/tink/shaded/protobuf/W;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/crypto/tink/shaded/protobuf/U;

.field public static final b:Lcom/google/crypto/tink/shaded/protobuf/U;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/W;->c()Lcom/google/crypto/tink/shaded/protobuf/U;

    move-result-object v0

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/W;->a:Lcom/google/crypto/tink/shaded/protobuf/U;

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/V;

    invoke-direct {v0}, Lcom/google/crypto/tink/shaded/protobuf/V;-><init>()V

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/W;->b:Lcom/google/crypto/tink/shaded/protobuf/U;

    return-void
.end method

.method public static a()Lcom/google/crypto/tink/shaded/protobuf/U;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/W;->a:Lcom/google/crypto/tink/shaded/protobuf/U;

    return-object v0
.end method

.method public static b()Lcom/google/crypto/tink/shaded/protobuf/U;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/W;->b:Lcom/google/crypto/tink/shaded/protobuf/U;

    return-object v0
.end method

.method public static c()Lcom/google/crypto/tink/shaded/protobuf/U;
    .locals 3

    .line 1
    :try_start_0
    const-string v0, "com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Class;

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/U;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method
