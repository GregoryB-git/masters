.class public abstract Lcom/google/protobuf/H;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/protobuf/F;

.field public static final b:Lcom/google/protobuf/F;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/google/protobuf/H;->c()Lcom/google/protobuf/F;

    move-result-object v0

    sput-object v0, Lcom/google/protobuf/H;->a:Lcom/google/protobuf/F;

    new-instance v0, Lcom/google/protobuf/G;

    invoke-direct {v0}, Lcom/google/protobuf/G;-><init>()V

    sput-object v0, Lcom/google/protobuf/H;->b:Lcom/google/protobuf/F;

    return-void
.end method

.method public static a()Lcom/google/protobuf/F;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/H;->a:Lcom/google/protobuf/F;

    return-object v0
.end method

.method public static b()Lcom/google/protobuf/F;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/H;->b:Lcom/google/protobuf/F;

    return-object v0
.end method

.method public static c()Lcom/google/protobuf/F;
    .locals 3

    .line 1
    :try_start_0
    const-string v0, "com.google.protobuf.MapFieldSchemaFull"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Class;

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/F;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method
