.class public final Lb1/i0$a;
.super Lec/j;
.source "SourceFile"

# interfaces
.implements Ldc/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb1/i0;-><init>(Ls1/c;Lb1/t0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lec/j;",
        "Ldc/a<",
        "Lb1/j0;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lb1/t0;


# direct methods
.method public constructor <init>(Lb1/t0;)V
    .locals 0

    iput-object p1, p0, Lb1/i0$a;->a:Lb1/t0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lec/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lb1/i0$a;->a:Lb1/t0;

    invoke-static {v0}, Lb1/h0;->c(Lb1/t0;)Lb1/j0;

    move-result-object v0

    return-object v0
.end method
