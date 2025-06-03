.class public final Li0/l$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li0/g$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li0/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Li0/g$a;

.field public c:Li0/y;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    new-instance v0, Li0/m$b;

    invoke-direct {v0}, Li0/m$b;-><init>()V

    invoke-direct {p0, p1, v0}, Li0/l$a;-><init>(Landroid/content/Context;Li0/g$a;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Li0/g$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Li0/l$a;->a:Landroid/content/Context;

    iput-object p2, p0, Li0/l$a;->b:Li0/g$a;

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Li0/g;
    .locals 1

    .line 1
    invoke-virtual {p0}, Li0/l$a;->b()Li0/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public b()Li0/l;
    .locals 3

    .line 1
    new-instance v0, Li0/l;

    .line 2
    .line 3
    iget-object v1, p0, Li0/l$a;->a:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v2, p0, Li0/l$a;->b:Li0/g$a;

    .line 6
    .line 7
    invoke-interface {v2}, Li0/g$a;->a()Li0/g;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-direct {v0, v1, v2}, Li0/l;-><init>(Landroid/content/Context;Li0/g;)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Li0/l$a;->c:Li0/y;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Li0/l;->c(Li0/y;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-object v0
.end method
