.class public final synthetic Ll2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo2/b$a;


# instance fields
.field public final synthetic a:Ll2/c;

.field public final synthetic b:Lf2/p;

.field public final synthetic c:Lf2/i;


# direct methods
.method public synthetic constructor <init>(Ll2/c;Lf2/p;Lf2/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll2/b;->a:Ll2/c;

    .line 5
    .line 6
    iput-object p2, p0, Ll2/b;->b:Lf2/p;

    .line 7
    .line 8
    iput-object p3, p0, Ll2/b;->c:Lf2/i;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final e()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Ll2/b;->a:Ll2/c;

    .line 2
    .line 3
    iget-object v1, p0, Ll2/b;->b:Lf2/p;

    .line 4
    .line 5
    iget-object v2, p0, Ll2/b;->c:Lf2/i;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Ll2/c;->b(Ll2/c;Lf2/p;Lf2/i;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method
