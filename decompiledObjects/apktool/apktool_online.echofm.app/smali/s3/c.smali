.class public final synthetic Ls3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr4/b;


# instance fields
.field public final synthetic a:Ls3/e;

.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Ls3/e;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ls3/c;->a:Ls3/e;

    .line 5
    .line 6
    iput-object p2, p0, Ls3/c;->b:Landroid/content/Context;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Ls3/c;->a:Ls3/e;

    .line 2
    .line 3
    iget-object v1, p0, Ls3/c;->b:Landroid/content/Context;

    .line 4
    .line 5
    invoke-static {v0, v1}, Ls3/e;->b(Ls3/e;Landroid/content/Context;)Lx4/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
