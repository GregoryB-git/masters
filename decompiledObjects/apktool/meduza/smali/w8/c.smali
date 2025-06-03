.class public final Lw8/c;
.super Lk6/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lk6/d<",
        "Lk6/a$d$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lk6/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk6/a<",
            "Lk6/a$d$c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lk6/a$g;

    invoke-direct {v0}, Lk6/a$g;-><init>()V

    new-instance v1, Lw8/c$a;

    invoke-direct {v1}, Lw8/c$a;-><init>()V

    new-instance v2, Lk6/a;

    const-string v3, "DynamicLinks.API"

    invoke-direct {v2, v3, v1, v0}, Lk6/a;-><init>(Ljava/lang/String;Lk6/a$a;Lk6/a$g;)V

    sput-object v2, Lw8/c;->a:Lk6/a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    sget-object v0, Lw8/c;->a:Lk6/a;

    sget-object v1, Lk6/a$d;->j:Lk6/a$d$c;

    sget-object v2, Lk6/d$a;->c:Lk6/d$a;

    invoke-direct {p0, p1, v0, v1, v2}, Lk6/d;-><init>(Landroid/content/Context;Lk6/a;Lk6/a$d;Lk6/d$a;)V

    return-void
.end method
