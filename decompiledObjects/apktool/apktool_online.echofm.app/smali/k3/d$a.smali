.class public abstract Lk3/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk3/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk3/d$a$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk3/d$a;->a:Ljava/lang/Class;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public abstract a(Lcom/google/crypto/tink/shaded/protobuf/O;)Lcom/google/crypto/tink/shaded/protobuf/O;
.end method

.method public final b()Ljava/lang/Class;
    .locals 1

    .line 1
    iget-object v0, p0, Lk3/d$a;->a:Ljava/lang/Class;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()Ljava/util/Map;
    .locals 1

    .line 1
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public abstract d(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcom/google/crypto/tink/shaded/protobuf/O;
.end method

.method public abstract e(Lcom/google/crypto/tink/shaded/protobuf/O;)V
.end method
