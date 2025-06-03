.class public final LC2/d;
.super Ly2/d;
.source "SourceFile"

# interfaces
.implements LA2/t;


# static fields
.field public static final k:Ly2/a$g;

.field public static final l:Ly2/a$a;

.field public static final m:Ly2/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ly2/a$g;

    .line 2
    .line 3
    invoke-direct {v0}, Ly2/a$g;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LC2/d;->k:Ly2/a$g;

    .line 7
    .line 8
    new-instance v1, LC2/c;

    .line 9
    .line 10
    invoke-direct {v1}, LC2/c;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, LC2/d;->l:Ly2/a$a;

    .line 14
    .line 15
    new-instance v2, Ly2/a;

    .line 16
    .line 17
    const-string v3, "ClientTelemetry.API"

    .line 18
    .line 19
    invoke-direct {v2, v3, v1, v0}, Ly2/a;-><init>(Ljava/lang/String;Ly2/a$a;Ly2/a$g;)V

    .line 20
    .line 21
    .line 22
    sput-object v2, LC2/d;->m:Ly2/a;

    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LA2/u;)V
    .locals 2

    .line 1
    sget-object v0, LC2/d;->m:Ly2/a;

    .line 2
    .line 3
    sget-object v1, Ly2/d$a;->c:Ly2/d$a;

    .line 4
    .line 5
    invoke-direct {p0, p1, v0, p2, v1}, Ly2/d;-><init>(Landroid/content/Context;Ly2/a;Ly2/a$d;Ly2/d$a;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(LA2/r;)LV2/j;
    .locals 4

    .line 1
    invoke-static {}, Lz2/m;->a()Lz2/m$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    new-array v1, v1, [Lx2/d;

    .line 7
    .line 8
    sget-object v2, LK2/d;->a:Lx2/d;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    aput-object v2, v1, v3

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lz2/m$a;->d([Lx2/d;)Lz2/m$a;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v3}, Lz2/m$a;->c(Z)Lz2/m$a;

    .line 17
    .line 18
    .line 19
    new-instance v1, LC2/b;

    .line 20
    .line 21
    invoke-direct {v1, p1}, LC2/b;-><init>(LA2/r;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lz2/m$a;->b(Lz2/k;)Lz2/m$a;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lz2/m$a;->a()Lz2/m;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p0, p1}, Ly2/d;->c(Lz2/m;)LV2/j;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1
.end method
