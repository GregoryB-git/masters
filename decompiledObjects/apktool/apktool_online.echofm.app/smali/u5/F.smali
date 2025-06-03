.class public Lu5/F;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu5/L$d;


# instance fields
.field public final a:LD5/i;

.field public final b:Lu5/L$b;


# direct methods
.method public constructor <init>(LD5/i;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lu5/L$b;

    .line 5
    .line 6
    invoke-direct {v0}, Lu5/L$b;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lu5/F;->b:Lu5/L$b;

    .line 10
    .line 11
    iput-object p1, p0, Lu5/F;->a:LD5/i;

    .line 12
    .line 13
    return-void
.end method

.method public static synthetic b(Lu5/L$d$a;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lu5/F;->c(Lu5/L$d$a;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Lu5/L$d$a;Z)V
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Lu5/L$d$a;->a(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Landroid/view/KeyEvent;Lu5/L$d$a;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    if-eq v0, v2, :cond_0

    .line 10
    .line 11
    invoke-interface {p2, v1}, Lu5/L$d$a;->a(Z)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v3, p0, Lu5/F;->b:Lu5/L$b;

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getUnicodeChar()I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    invoke-virtual {v3, v4}, Lu5/L$b;->a(I)Ljava/lang/Character;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    new-instance v4, LD5/i$b;

    .line 26
    .line 27
    invoke-direct {v4, p1, v3}, LD5/i$b;-><init>(Landroid/view/KeyEvent;Ljava/lang/Character;)V

    .line 28
    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    move v1, v2

    .line 33
    :cond_1
    iget-object p1, p0, Lu5/F;->a:LD5/i;

    .line 34
    .line 35
    new-instance v0, Lu5/E;

    .line 36
    .line 37
    invoke-direct {v0, p2}, Lu5/E;-><init>(Lu5/L$d$a;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, v4, v1, v0}, LD5/i;->e(LD5/i$b;ZLD5/i$a;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method
