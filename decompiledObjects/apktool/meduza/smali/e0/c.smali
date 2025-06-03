.class public final Le0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le0/c$e;,
        Le0/c$d;,
        Le0/c$a;,
        Le0/c$c;,
        Le0/c$b;,
        Le0/c$f;
    }
.end annotation


# instance fields
.field public final a:Le0/c$e;


# direct methods
.method public constructor <init>(Le0/c$e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le0/c;->a:Le0/c$e;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Le0/c;->a:Le0/c$e;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
