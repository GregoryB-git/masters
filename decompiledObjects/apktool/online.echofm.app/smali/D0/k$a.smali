.class public LD0/k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD0/F$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD0/k;->U(ZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:LD0/k;


# direct methods
.method public constructor <init>(LD0/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, LD0/k$a;->b:LD0/k;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(LD0/F;)V
    .locals 0

    .line 1
    iget-object p1, p0, LD0/k$a;->b:LD0/k;

    .line 2
    .line 3
    invoke-static {p1}, LD0/k;->Q1(LD0/k;)Landroid/view/Surface;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, LD0/k$a;->b:LD0/k;

    .line 11
    .line 12
    invoke-static {p1}, LD0/k;->R1(LD0/k;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public b(LD0/F;)V
    .locals 2

    .line 1
    iget-object p1, p0, LD0/k$a;->b:LD0/k;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    invoke-virtual {p1, v0, v1}, LD0/k;->N2(II)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public c(LD0/F;Ld0/P;)V
    .locals 0

    .line 1
    return-void
.end method
