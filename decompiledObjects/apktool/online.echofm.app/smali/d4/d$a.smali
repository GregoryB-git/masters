.class public Ld4/d$a;
.super Ld4/c$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld4/d;->f(Ld4/n;Ld4/d$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ld4/d$b;


# direct methods
.method public constructor <init>(Ld4/d$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ld4/d$a;->a:Ld4/d$b;

    .line 2
    .line 3
    invoke-direct {p0}, Ld4/c$c;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public b(Ld4/b;Ld4/n;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ld4/d$a;->a:Ld4/d$b;

    .line 2
    .line 3
    invoke-static {v0, p1}, Ld4/d$b;->e(Ld4/d$b;Ld4/b;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Ld4/d$a;->a:Ld4/d$b;

    .line 7
    .line 8
    invoke-static {p2, p1}, Ld4/d;->a(Ld4/n;Ld4/d$b;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Ld4/d$a;->a:Ld4/d$b;

    .line 12
    .line 13
    invoke-static {p1}, Ld4/d$b;->f(Ld4/d$b;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
