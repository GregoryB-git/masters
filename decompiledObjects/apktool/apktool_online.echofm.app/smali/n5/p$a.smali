.class public Ln5/p$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln5/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln5/p;->a(Ln5/q;Ln5/k;Ljava/lang/Runnable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ln5/k;

.field public final synthetic b:Ln5/q;


# direct methods
.method public constructor <init>(Ln5/q;Ln5/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ln5/p$a;->b:Ln5/q;

    .line 2
    .line 3
    iput-object p2, p0, Ln5/p$a;->a:Ln5/k;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget-object v0, p0, Ln5/p$a;->a:Ln5/k;

    .line 2
    .line 3
    iget v0, v0, Ln5/k;->c:I

    .line 4
    .line 5
    return v0
.end method

.method public b()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ln5/p$a;->a:Ln5/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln5/k;->F()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
