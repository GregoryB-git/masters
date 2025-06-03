.class public final Leb/h0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Leb/h0$a;
    }
.end annotation


# static fields
.field public static final a:Ljava/nio/charset/Charset;

.field public static final b:Lp7/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "US-ASCII"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Leb/h0;->a:Ljava/nio/charset/Charset;

    sget-object v0, Leb/s0;->e:Lp7/a;

    sput-object v0, Leb/h0;->b:Lp7/a;

    return-void
.end method

.method public static a(Ljava/lang/String;Leb/h0$a;)Leb/s0$f;
    .locals 3

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v2, 0x3a

    if-ne v0, v2, :cond_0

    const/4 v1, 0x1

    :cond_0
    sget-object v0, Leb/s0$d;->d:Ljava/util/BitSet;

    new-instance v0, Leb/s0$f;

    invoke-direct {v0, p0, v1, p1}, Leb/s0$f;-><init>(Ljava/lang/String;ZLeb/s0$g;)V

    return-object v0
.end method
