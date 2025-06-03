.class public final Lf2/g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf2/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/Object;I)Lf2/h;
    .locals 2

    sget-object v0, Lp2/m0;->d:Lp2/m0;

    const-string v1, "<this>"

    invoke-static {p0, v1}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "verificationMode"

    invoke-static {p1, v1}, La0/j;->p(ILjava/lang/String;)V

    new-instance v1, Lf2/h;

    invoke-direct {v1, p0, p1, v0}, Lf2/h;-><init>(Ljava/lang/Object;ILf2/f;)V

    return-object v1
.end method
