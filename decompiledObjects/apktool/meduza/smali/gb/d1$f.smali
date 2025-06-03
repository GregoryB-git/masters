.class public final Lgb/d1$f;
.super Leb/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgb/d1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation


# instance fields
.field public a:Leb/f0;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Leb/d;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Leb/d$a;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lgb/d1$f;->a:Leb/f0;

    invoke-static {p1}, Lgb/n;->c(Leb/d$a;)Ljava/util/logging/Level;

    move-result-object p1

    sget-object v1, Lgb/p;->c:Ljava/util/logging/Logger;

    invoke-virtual {v1, p1}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0, p1, p2}, Lgb/p;->a(Leb/f0;Ljava/util/logging/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final varargs b(Leb/d$a;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lgb/d1$f;->a:Leb/f0;

    invoke-static {p1}, Lgb/n;->c(Leb/d$a;)Ljava/util/logging/Level;

    move-result-object p1

    sget-object v1, Lgb/p;->c:Ljava/util/logging/Logger;

    invoke-virtual {v1, p1}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, p3}, Ljava/text/MessageFormat;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p1, p2}, Lgb/p;->a(Leb/f0;Ljava/util/logging/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method
