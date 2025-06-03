.class public abstract Lcom/google/crypto/tink/shaded/protobuf/E;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/crypto/tink/shaded/protobuf/E$c;,
        Lcom/google/crypto/tink/shaded/protobuf/E$b;
    }
.end annotation


# static fields
.field public static final a:Lcom/google/crypto/tink/shaded/protobuf/E;

.field public static final b:Lcom/google/crypto/tink/shaded/protobuf/E;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/E$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/E$b;-><init>(Lcom/google/crypto/tink/shaded/protobuf/E$a;)V

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/E;->a:Lcom/google/crypto/tink/shaded/protobuf/E;

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/E$c;

    invoke-direct {v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/E$c;-><init>(Lcom/google/crypto/tink/shaded/protobuf/E$a;)V

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/E;->b:Lcom/google/crypto/tink/shaded/protobuf/E;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/crypto/tink/shaded/protobuf/E$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/E;-><init>()V

    return-void
.end method

.method public static a()Lcom/google/crypto/tink/shaded/protobuf/E;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/E;->a:Lcom/google/crypto/tink/shaded/protobuf/E;

    return-object v0
.end method

.method public static b()Lcom/google/crypto/tink/shaded/protobuf/E;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/E;->b:Lcom/google/crypto/tink/shaded/protobuf/E;

    return-object v0
.end method


# virtual methods
.method public abstract c(Ljava/lang/Object;J)V
.end method

.method public abstract d(Ljava/lang/Object;Ljava/lang/Object;J)V
.end method

.method public abstract e(Ljava/lang/Object;J)Ljava/util/List;
.end method
