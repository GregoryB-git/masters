.class public final Leb/s0$b;
.super Leb/s0$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Leb/s0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
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
.field public final e:Leb/s0$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Leb/s0$c<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Leb/s0$c;)V
    .locals 3

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2}, Leb/s0$d;-><init>(Ljava/lang/String;ZLjava/lang/Object;)V

    const-string v0, "-bin"

    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    const-string v2, "ASCII header is named %s.  Only binary headers may end with %s"

    invoke-static {v1, v2, p1, v0}, Lx6/b;->r(ZLjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string p1, "marshaller"

    invoke-static {p2, p1}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p2, p0, Leb/s0$b;->e:Leb/s0$c;

    return-void
.end method


# virtual methods
.method public final a([B)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)TT;"
        }
    .end annotation

    iget-object v0, p0, Leb/s0$b;->e:Leb/s0$c;

    new-instance v1, Ljava/lang/String;

    sget-object v2, Ln7/d;->a:Ljava/nio/charset/Charset;

    invoke-direct {v1, p1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-interface {v0, v1}, Leb/s0$c;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/io/Serializable;)[B
    .locals 1

    iget-object v0, p0, Leb/s0$b;->e:Leb/s0$c;

    invoke-interface {v0, p1}, Leb/s0$c;->a(Ljava/io/Serializable;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "null marshaller.toAsciiString()"

    invoke-static {p1, v0}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Ln7/d;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    return-object p1
.end method
