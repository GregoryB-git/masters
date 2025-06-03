.class public final synthetic Lp1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu/c$c;


# instance fields
.field public final synthetic a:Lp6/P;

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lp6/P;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp1/a;->a:Lp6/P;

    .line 5
    .line 6
    iput-object p2, p0, Lp1/a;->b:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lu/c$a;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lp1/a;->a:Lp6/P;

    .line 2
    .line 3
    iget-object v1, p0, Lp1/a;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lp1/b;->a(Lp6/P;Ljava/lang/Object;Lu/c$a;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
