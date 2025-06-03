.class public interface abstract Lk6/a$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk6/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk6/a$d$c;,
        Lk6/a$d$b;,
        Lk6/a$d$a;
    }
.end annotation


# static fields
.field public static final j:Lk6/a$d$c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lk6/a$d$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lk6/a$d$c;-><init>(I)V

    sput-object v0, Lk6/a$d;->j:Lk6/a$d$c;

    return-void
.end method
