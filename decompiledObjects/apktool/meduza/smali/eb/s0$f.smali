.class public final Leb/s0$f;
.super Leb/s0$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Leb/s0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Leb/s0$d<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final e:Leb/s0$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Leb/s0$g<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLeb/s0$g;)V
    .locals 2

    invoke-direct {p0, p1, p2, p3}, Leb/s0$d;-><init>(Ljava/lang/String;ZLjava/lang/Object;)V

    const-string p2, "-bin"

    invoke-virtual {p1, p2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "ASCII header is named %s.  Only binary headers may end with %s"

    invoke-static {v0, v1, p1, p2}, Lx6/b;->r(ZLjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p3, p0, Leb/s0$f;->e:Leb/s0$g;

    return-void
.end method


# virtual methods
.method public final a([B)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)TT;"
        }
    .end annotation

    iget-object v0, p0, Leb/s0$f;->e:Leb/s0$g;

    invoke-interface {v0, p1}, Leb/s0$g;->b([B)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/io/Serializable;)[B
    .locals 1

    iget-object v0, p0, Leb/s0$f;->e:Leb/s0$g;

    invoke-interface {v0, p1}, Leb/s0$g;->a(Ljava/io/Serializable;)[B

    move-result-object p1

    const-string v0, "null marshaller.toAsciiString()"

    invoke-static {p1, v0}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method
