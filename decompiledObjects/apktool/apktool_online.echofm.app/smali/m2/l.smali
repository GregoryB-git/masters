.class public final synthetic Lm2/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo2/b$a;


# instance fields
.field public final synthetic a:Lm2/r;

.field public final synthetic b:Lf2/p;


# direct methods
.method public synthetic constructor <init>(Lm2/r;Lf2/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm2/l;->a:Lm2/r;

    .line 5
    .line 6
    iput-object p2, p0, Lm2/l;->b:Lf2/p;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final e()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lm2/l;->a:Lm2/r;

    .line 2
    .line 3
    iget-object v1, p0, Lm2/l;->b:Lf2/p;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lm2/r;->a(Lm2/r;Lf2/p;)Ljava/lang/Iterable;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
