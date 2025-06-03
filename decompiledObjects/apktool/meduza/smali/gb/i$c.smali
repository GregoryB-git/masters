.class public final Lgb/i$c;
.super Leb/k0$j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgb/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:Leb/e1;


# direct methods
.method public constructor <init>(Leb/e1;)V
    .locals 0

    invoke-direct {p0}, Leb/k0$j;-><init>()V

    iput-object p1, p0, Lgb/i$c;->a:Leb/e1;

    return-void
.end method


# virtual methods
.method public final a(Leb/k0$g;)Leb/k0$f;
    .locals 0

    iget-object p1, p0, Lgb/i$c;->a:Leb/e1;

    invoke-static {p1}, Leb/k0$f;->a(Leb/e1;)Leb/k0$f;

    move-result-object p1

    return-object p1
.end method
